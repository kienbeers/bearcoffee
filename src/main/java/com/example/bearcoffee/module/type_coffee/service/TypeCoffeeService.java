package com.example.bearcoffee.module.type_coffee.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;

import com.example.bearcoffee.core.Filter;
import com.example.bearcoffee.exceptions.CustomException;
import com.example.bearcoffee.module.type_coffee.TypeCoffeeEntity;
import com.example.bearcoffee.module.type_coffee.TypeCoffeeRequest;

public interface TypeCoffeeService {
    TypeCoffeeEntity insert(TypeCoffeeRequest request) throws CustomException;

    TypeCoffeeEntity edit(Long id, TypeCoffeeRequest post) throws CustomException;

    TypeCoffeeEntity delete(Long id) throws CustomException;

    Page<TypeCoffeeEntity> paginate(int page, int limit, List<Filter> whereParams, Map<String, String> sortBy);

    TypeCoffeeEntity open(Long id) throws CustomException;

    TypeCoffeeEntity close(Long id) throws CustomException;

    List<TypeCoffeeEntity> findAll();
}
