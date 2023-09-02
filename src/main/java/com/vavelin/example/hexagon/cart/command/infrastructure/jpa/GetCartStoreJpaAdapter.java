package com.vavelin.example.hexagon.cart.command.infrastructure.jpa;

import com.vavelin.example.hexagon.cart.command.domain.Cart;
import com.vavelin.example.hexagon.cart.command.domain.GetCartStorePort;
import org.springframework.stereotype.Repository;

@Repository
public class GetCartStoreJpaAdapter implements GetCartStorePort {
    @Override
    public Cart get(Long cartId) {
        return new Cart(cartId);
    }
}