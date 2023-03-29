package com.example.bearcoffee.module.users.user_role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRoleEntity, Long>, JpaSpecificationExecutor<UserRoleEntity> {

    @Modifying
    @Query("DELETE FROM UserRoleEntity ur WHERE ur.userId in (?1)")
    void deleteByUserIds(Collection<Long> userIds);
}
