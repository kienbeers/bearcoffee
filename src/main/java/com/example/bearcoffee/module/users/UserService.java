package com.example.bearcoffee.module.users;

import com.example.bearcoffee.core.Filter;
import com.example.bearcoffee.exceptions.CustomException;
import com.example.bearcoffee.module.users.UserEntity;
import com.example.bearcoffee.module.users.UserRequest;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;

public interface UserService {

        UserEntity save(UserRequest user) throws CustomException;

        UserEntity createClient(UserRequest userRequest) throws CustomException;

        UserEntity edit(Long id, UserRequest user) throws CustomException;

        UserEntity delete(Long id) throws CustomException;

        Page<UserEntity> paginate(String searchUserName, Integer searchStatus, int page, int limit, List<Filter> whereParams, Map<String, String> sortBy);

        UserEntity open(Long id) throws CustomException;

        UserEntity close(Long id) throws CustomException;

        UserEntity find(Long id) throws CustomException;
//        SumProductDTO countCustomer();
}
