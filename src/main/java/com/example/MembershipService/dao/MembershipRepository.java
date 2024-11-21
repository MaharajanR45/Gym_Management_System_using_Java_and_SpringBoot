package com.example.MembershipService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MembershipService.model.Membership;

public interface MembershipRepository extends JpaRepository<Membership, Long> {
}
