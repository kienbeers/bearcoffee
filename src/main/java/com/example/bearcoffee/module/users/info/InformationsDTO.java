package com.example.bearcoffee.module.users.info;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class InformationsDTO implements Serializable {
    private Long id;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String address;
    private int active;
    private Long userId;
}
