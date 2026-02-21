package com.kata.bookstore.service;

import com.kata.bookstore.common.PricingConstants;
import com.kata.bookstore.domain.BookType;

import java.math.BigDecimal;
import java.util.Map;

public class PricingService {

    private static final double BOOK_PRICE = 50.0;

    public double calculateTotal(Map<String, Integer> cart) {

        if (cart == null || cart.isEmpty()) {
            return 0.0;
        }

        int totalQuantity = cart.values()
                .stream()
                .mapToInt(Integer::intValue)
                .sum();

        return totalQuantity * BOOK_PRICE;
    }
}
