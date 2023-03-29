package com.example.bearcoffee.module.users;

import com.example.bearcoffee.module.users.user_role.UserRoleDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserRequest {
    @NotBlank(message = "Tài khoản không được để trống")
    private String username;

    private String password;

    private String newPassword;

    @NotNull(message = "Trạng thái không được để trống")
    private int status;
}
