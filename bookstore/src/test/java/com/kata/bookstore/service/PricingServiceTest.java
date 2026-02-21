package com.kata.bookstore.service;

import com.kata.bookstore.domain.BookType;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PricingServiceTest {

    private final PricingService pricingService = new PricingService();

    @Test
    void shouldReturnZeroWhenCartIsNull() {
        assertEquals(0.0, pricingService.calculateTotal((Map<String, Integer>) null));
    }

    @Test
    void shouldCalculatePriceForSingleBook() {
        Map<String, Integer> cart =
                Map.of("CLEAN_CODE", 1);
        assertEquals(50.0, pricingService.calculateTotal(cart));
    }

    @Test
    void shouldCalculateSubtotalForMultipleBooks() {
        Map<String, Integer> cart = Map.of(
                "CLEAN_CODE", 2,
                "CLEAN_CODER", 1
        );

        assertEquals(150.0, pricingService.calculateTotal(cart));
    }
}
