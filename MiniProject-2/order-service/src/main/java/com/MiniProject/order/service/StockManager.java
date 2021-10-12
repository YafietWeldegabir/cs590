package com.MiniProject.order.service;

import com.MiniProject.order.repository.productRepository;
import com.MiniProject.order.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StockManager {

    @Autowired
    productRepository productRepository;

    public boolean checkout(int productId, int amount){
        Optional<Product> product = productRepository.findById(productId);
        int inStore = product.get().getCount();
        int updatedCount= inStore - amount;
        product.get().setCount(updatedCount);

        productRepository.findById(productId).map(target -> {
            target.setCount(updatedCount);
            return productRepository.save(target);
        });

        return true;
    }

    public boolean manageStock(int productId, int amount){
        if(productRepository.existsById(productId)){
            if(productRepository.getById(productId).getCount()<amount){
                return false;
            }else{
                int count = productRepository.getById(productId).getCount();

            }
            return checkout(productId, amount);
        }else{
            return false;
        }
    }
}
