package com.example.bearcoffee.module.type_coffee;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;

public class TypeCoffeeMapper {
    private static TypeCoffeeMapper INSTANCE;

    public static TypeCoffeeMapper getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TypeCoffeeMapper();
        }
        return INSTANCE;
    }

    public TypeCoffeeMapper() {

    }

    public static TypeCoffeeDTO toDTO(TypeCoffeeEntity type) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(type, TypeCoffeeDTO.class);
    }

    public static TypeCoffeeEntity toEntity(TypeCoffeeMapper typeDto) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(typeDto, TypeCoffeeEntity.class);
    }

    public static Page<TypeCoffeeDTO> toPageDTO(Page<TypeCoffeeEntity> page) {
        return page.map(new Function<>() {
            @Override
            public TypeCoffeeDTO apply(TypeCoffeeEntity entity) {
                return TypeCoffeeMapper.toDTO(entity);
            }
        });
    }

    public static List<TypeCoffeeDTO> toListDTO(List<TypeCoffeeEntity> entityList) {
        List<TypeCoffeeDTO> list = new ArrayList<>();
        for (TypeCoffeeEntity e : entityList) {
            list.add(TypeCoffeeMapper.toDTO(e));
        }
        return list;
    }

}
