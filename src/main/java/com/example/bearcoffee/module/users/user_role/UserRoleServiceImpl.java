package com.example.bearcoffee.module.users.user_role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
@Transactional(rollbackFor = Throwable.class)
public class UserRoleServiceImpl implements UserRoleService{
    @Autowired
    UserRoleRepository userRoleRepository;

    @Override
    public List<UserRoleDTO> updateRole(UserRoleRequest userRoleRequest) {
        List<UserRoleDTO> userRoles = userRoleRequest.getValues();
        List<Long> listUserIds = new ArrayList<>();
        List<UserRoleEntity> userRoleEntities = new ArrayList<>();
        for (UserRoleDTO userRole : userRoles) {
            if (!listUserIds.contains(userRole.getUserId())) {
                listUserIds.add(userRole.getUserId());
            }
            for (Long roleId : userRole.getRoleIds()) {
                UserRoleEntity userRoleEntity = new UserRoleEntity();
                userRoleEntity.setUserId(userRole.getUserId());
                userRoleEntity.setRoleId(roleId);
                userRoleEntities.add(userRoleEntity);
            }
        }
        HashSet<Long> userIds = new HashSet<>(listUserIds);
        userRoleRepository.deleteByUserIds(userIds);
        userRoleRepository.saveAll(userRoleEntities);
        return userRoles;
    }
}
