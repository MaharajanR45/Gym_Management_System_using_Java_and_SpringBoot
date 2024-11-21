package com.example.MembershipService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.MembershipService.model.Membership;
import com.example.MembershipService.service.MembershipService;

@RestController
@RequestMapping("/api/memberships")
public class MembershipController {
    @Autowired
    private MembershipService membershipService;

    @PostMapping("/create")
    public Membership createMembership(@RequestParam Long userId, @RequestParam String planName) {
        return membershipService.createMembership(userId, planName);
    }
}
