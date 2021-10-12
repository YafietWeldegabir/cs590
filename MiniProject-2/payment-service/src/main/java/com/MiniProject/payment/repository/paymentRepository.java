package com.MiniProject.payment.repository;

import com.MiniProject.payment.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface paymentRepository extends JpaRepository<Payment, Integer> {

    public Payment findByUserID(int userid);
}
