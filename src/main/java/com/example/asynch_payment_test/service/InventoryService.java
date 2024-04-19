package com.example.asynch_payment_test.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class InventoryService {

    public boolean checkProductAvailability(int productId) {
        return true;
    }
}
