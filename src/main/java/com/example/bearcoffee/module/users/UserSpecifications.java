package com.example.bearcoffee.module.users;

import com.example.bearcoffee.core.BaseSpecifications;

public class UserSpecifications extends BaseSpecifications<UserEntity> {

    private static UserSpecifications INSTANCE;

    public static UserSpecifications getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UserSpecifications();
        }

        return INSTANCE;
    }



}
