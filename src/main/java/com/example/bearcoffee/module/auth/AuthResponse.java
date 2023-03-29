package com.example.bearcoffee.module.auth;

import com.example.bearcoffee.core.BaseResponse;

public class AuthResponse extends BaseResponse<AuthDTO> {
    public AuthResponse(int status, String message, AuthDTO data) {
        super(status, message, data);
    }

    public AuthResponse() {
    }

    public AuthResponse(AuthDTO data) {
        super(data);
    }
}
