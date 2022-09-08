package com.liu.class3.test.controller;

import com.liu.class3.test.entity.Delivery;
import com.liu.class3.test.entity.RecipientAndPrice;
import com.liu.class3.test.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    DeliveryService deliveryService;

    @PostMapping
    public Long scheduleDelivery(@RequestBody Delivery delivery){
        return deliveryService.save(delivery);
    }

    @GetMapping("/bill/{deliveryId}")
    public RecipientAndPrice getBill(@PathVariable Long deliveryId) {
        return deliveryService.getBill(deliveryId);
    }
}
