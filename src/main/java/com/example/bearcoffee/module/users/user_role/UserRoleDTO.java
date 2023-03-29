package com.example.bearcoffee.module.users.user_role;

import com.example.bearcoffee.core.BaseDTO;
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
public class UserRoleDTO extends BaseDTO implements Serializable {
    private Long userId;
    private List<Long> roleIds;
}