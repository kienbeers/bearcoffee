package com.example.bearcoffee.module.users;

import com.example.bearcoffee.core.BaseEntity;
import com.example.bearcoffee.module.users.info.InformationEntity;
import com.example.bearcoffee.module.users.roles.RoleEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
@EqualsAndHashCode(callSuper = true)
public class UserEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "role_id", nullable = false))
    private List<RoleEntity> roles = new ArrayList<>();

    private String username;
    private String password;
    private Integer status;

//    @JsonIgnore
//    @OneToMany(mappedBy = "user")
//    List<OrderEntity> order;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    List<InformationEntity> information;

    public void setData(UserRequest request) {
        BCryptPasswordEncoder b = new BCryptPasswordEncoder();
        this.username = request.getUsername();
        this.password = b.encode(request.getNewPassword());
        this.status = request.getStatus();
    }
}
