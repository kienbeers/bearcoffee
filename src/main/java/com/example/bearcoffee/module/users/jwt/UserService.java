package com.example.bearcoffee.module.users.jwt;

import com.example.bearcoffee.module.users.UserEntity;
import com.example.bearcoffee.module.users.UserRepository;
import com.example.bearcoffee.module.users.roles.RoleEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service("userServiceDetails")
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (RoleEntity item: user.getRoles()) {
            authorities.add(new SimpleGrantedAuthority("ROLE_"+item.getRole()));
        }
        CustomUserDetails userDetails = new CustomUserDetails(user.getUsername(), user.getPassword(), authorities);
        BeanUtils.copyProperties(user, userDetails);
        return userDetails;
    }

    @Transactional
    public UserDetails loadUserById(Long id) {
        UserEntity user = userRepository.findById(id).orElseThrow(
                () -> new UsernameNotFoundException("Không tìm thấy người có id : " + id)
        );

        return CustomUserDetails.build(user);
    }
}
