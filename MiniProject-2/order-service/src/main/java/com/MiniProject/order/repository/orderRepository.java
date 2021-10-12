package com.MiniProject.order.repository;

import com.MiniProject.order.domain.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface orderRepository extends JpaRepository<OrderLine, Integer> {
    Optional<OrderLine> findByUser(int userid);
}
