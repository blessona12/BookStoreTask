package com.kata.bookstore.service;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PricingServiceTest {

    private final PricingService pricingService = new PricingService();

    @Test
    void shouldReturnZeroWhenCartIsEmpty() {
        assertEquals(0.0, pricingService.calculateTotal());
    }
}
