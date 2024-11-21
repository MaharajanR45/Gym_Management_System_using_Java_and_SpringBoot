package com.example.MembershipService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.MembershipService.dao.MembershipRepository;
import com.example.MembershipService.model.Membership;

@Service
public class MembershipService {
    @Autowired
    private MembershipRepository membershipRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Membership createMembership(Long userId, String planName) {
        // Verify user existence via User Service
    	String userServiceUrl = "http://user-service/api/users/" + userId;
    	Object user = restTemplate.getForObject(userServiceUrl, Object.class);
        
        if (user == null) {
            throw new RuntimeException("User not found");
        }

        Membership membership = new Membership();
        membership.setUserId(userId);
        membership.setPlanName(planName);
        return membershipRepository.save(membership);
    }
}
