package com.example.bearcoffee.module.users.info;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class InformationsRequest {
    @NotBlank(message = "tên không được để trống")
    private String fullName;

    @NotBlank(message = "email không được để trống")
    @Email
    private String email;

    @NotBlank(message = "số điện thoại không được để trống")
    private String phoneNumber;

    @NotBlank(message = "địa chỉ không được để trống")
    private String address;
}
