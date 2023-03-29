package com.example.bearcoffee.module.users.info;

import com.example.bearcoffee.core.BaseSpecifications;

public class InformationSpecifications extends BaseSpecifications<InformationEntity> {
    private static InformationSpecifications INSTANCE;

    public static InformationSpecifications getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new InformationSpecifications();
        }

        return INSTANCE;
    }
}