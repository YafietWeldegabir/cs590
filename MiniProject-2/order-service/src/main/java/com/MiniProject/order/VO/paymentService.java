package com.MiniProject.order.VO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class paymentService {


    @Autowired
    private RestTemplate restTemplate;

    public Payment getPayment(int userId) {

        Payment payment =
                restTemplate.getForObject("localhost:9003/payment/" + userId
                        ,Payment.class);
        return  payment;
    }

}
