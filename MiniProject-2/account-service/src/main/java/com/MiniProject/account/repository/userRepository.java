package com.MiniProject.account.repository;

import com.MiniProject.account.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface userRepository extends JpaRepository<User, Integer> {



}
