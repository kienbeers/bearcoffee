package com.example.bearcoffee.module.users.info;

import com.example.bearcoffee.core.BaseEntity;
import com.example.bearcoffee.module.users.UserEntity;
import lombok.*;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "informations")
@EqualsAndHashCode(callSuper = true)
public class InformationEntity extends BaseEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column(name="full_name")
    private String fullName;
    @Column(name="email")
    private String email;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name="address")
    private String address;
    @Column(name="active")
    private int active;
    @ManyToOne
    @JoinColumn(name="id_user")
    private UserEntity user;

    public void setData(InformationsRequest request) {
        this.fullName = request.getFullName();
        this.email=request.getEmail();
        this.phoneNumber=request.getPhoneNumber();
        this.address=request.getAddress();
//        this.user=request.getUser();
//        this.active = request.getActive();
    }
}
