package com.devock.tutorial.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devock.tutorial.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    @EntityGraph(attributePaths = "authorities")
    Optional<User> findOneWithAuthoritiesByUsername(String username);
}
