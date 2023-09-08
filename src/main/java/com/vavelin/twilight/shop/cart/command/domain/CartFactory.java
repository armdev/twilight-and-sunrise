package com.vavelin.twilight.shop.cart.command.domain;

import com.vavelin.twilight.shop.spring.stereotypes.AggregateFactory;

@AggregateFactory
public class CartFactory {
    public Cart newCart(String username) {
        return newCart(1L, username);
    }

    public Cart newCart(Long id, String username) {
        return new Cart(id, username);
    }

}
