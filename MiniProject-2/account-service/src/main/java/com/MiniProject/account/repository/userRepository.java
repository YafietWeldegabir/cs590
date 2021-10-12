package com.MiniProject.account.repository;

import com.MiniProject.account.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User, Integer> {
}
