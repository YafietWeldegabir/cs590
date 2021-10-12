package com.MiniProject.shipping.Service;

import com.MiniProject.shipping.Domain.Shipping;
import com.MiniProject.shipping.Repository.ShippingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ShippingService {
    @Autowired
    ShippingRepository shippingRepository;

    public void saveShipping(Shipping shipping) {
        log.info("I am Inside saveUser of UserService");
        shippingRepository.save(shipping);
    }

    public Shipping findShippingById(Long shippingId) {
        log.info("I am Inside findUser of UserService");
        return shippingRepository.findShippingByShippingId(shippingId);
    }

    public List<Shipping> getAllShipping(){
        return shippingRepository.findAll();
    }
    public Shipping getLast(){
        return shippingRepository.findTopByOrderByShippingIdDesc();
    }

}
