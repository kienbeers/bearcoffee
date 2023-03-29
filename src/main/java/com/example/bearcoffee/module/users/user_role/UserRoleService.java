package com.example.bearcoffee.module.users.user_role;

import java.util.List;

public interface UserRoleService {
    List<UserRoleDTO> updateRole(UserRoleRequest userRoleRequest);
}
