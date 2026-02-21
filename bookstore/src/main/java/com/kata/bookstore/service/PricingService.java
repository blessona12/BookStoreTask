package com.kata.bookstore.service;

import com.kata.bookstore.domain.BookType;

import java.util.Map;

public class PricingService {

    private static final double BOOK_PRICE = 50.0;

    public double calculateTotal(int quantity) {
        return quantity*BOOK_PRICE;
    }
}
