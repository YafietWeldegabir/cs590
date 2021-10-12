package com.MiniProject.order.DTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class paymentService {


    @Autowired
    private RestTemplate restTemplate;

    public Payment getPayment(int userId) {

        Payment payment =
                restTemplate.getForObject("http://PAYMENT-SERVICE/payment/" + userId
                        ,Payment.class);
        return  payment;
    }

}
