package com.langbreeze.memberservice.dao;

import com.langbreeze.memberservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberDao extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

}
