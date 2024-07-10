package com.devock.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devock.tutorial.entity.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}