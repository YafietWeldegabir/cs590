package com.MiniProject.payment.controller;

import com.MiniProject.payment.domain.Payment;
import com.MiniProject.payment.repository.paymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.util.List;

@RestController
@RequestMapping(value = "/payment")
public class paymentController{

    @Autowired
    paymentRepository paymentRepository;

    @PostMapping
    public List<Payment> save(@RequestBody Payment payment){
        paymentRepository.save(payment);
        return paymentRepository.findAll();

    }

    @GetMapping(value = "/{id}/{paymentType}")
    public boolean pay(@PathVariable("id") int id, @PathVariable("paymentType") String type){

        if(paymentRepository.findByUserID(id).getPaymentType().equals(type)){
            return true;

        }else{
            return false;
        }

    }

    @GetMapping(value="/{id}")
    public Payment getPayment(@PathVariable("id") int id){
        return paymentRepository.findByUserID(id);
    }

    @GetMapping
    public List<Payment> all(){
        return paymentRepository.findAll();
    }
}
