package com.example.bearcoffee.module.type_coffee;

import com.example.bearcoffee.core.BaseSpecifications;

public class TypeCoffeeSpecifications extends BaseSpecifications<TypeCoffeeEntity> {
    private static TypeCoffeeSpecifications INSTANCE;

    public static TypeCoffeeSpecifications getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TypeCoffeeSpecifications();
        }
        return INSTANCE;
    }
}
