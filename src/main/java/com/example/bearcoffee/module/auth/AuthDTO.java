package com.example.bearcoffee.module.auth;

import com.example.bearcoffee.module.users.info.InformationsDTO;
import com.example.bearcoffee.module.users.roles.RoleDTO;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AuthDTO implements Serializable {
    private Long id;
    private String token;
    private List<RoleDTO> roles;
    private String username;
    private List<InformationsDTO> information;
}
