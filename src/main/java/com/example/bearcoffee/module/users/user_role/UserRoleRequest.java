package com.example.bearcoffee.module.users.user_role;

import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserRoleRequest {
    private List<UserRoleDTO> values;
}