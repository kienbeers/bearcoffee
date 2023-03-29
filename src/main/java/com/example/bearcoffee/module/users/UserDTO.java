package com.example.bearcoffee.module.users;

import com.example.bearcoffee.core.BaseDTO;
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
@EqualsAndHashCode(callSuper = true)
public class UserDTO extends BaseDTO implements Serializable {
    private int id;
    private String username;
    private int status;
    List<RoleDTO> roles;
    List<InformationsDTO> information;
}
