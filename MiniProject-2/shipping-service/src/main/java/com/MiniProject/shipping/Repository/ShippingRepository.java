package com.MiniProject.shipping.Repository;

import com.MiniProject.shipping.Domain.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingRepository extends JpaRepository<Shipping, Long> {

    Shipping findShippingByShippingId(Long shippingId);
    Shipping findTopByOrderByShippingIdDesc();


}
