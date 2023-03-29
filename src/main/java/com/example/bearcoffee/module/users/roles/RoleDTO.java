package com.example.bearcoffee.module.users.roles;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RoleDTO {
    private Long id;
    private String role;
}