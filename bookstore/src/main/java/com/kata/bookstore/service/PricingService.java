package com.kata.bookstore.service;

import com.kata.bookstore.domain.BookType;

import java.util.Map;

public class PricingService {

    public double calculateTotal(int quantity) {
        return quantity*50.0;
    }
}
