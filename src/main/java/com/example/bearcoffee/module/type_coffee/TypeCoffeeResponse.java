package com.example.bearcoffee.module.type_coffee;

import org.springframework.data.domain.Page;

import com.example.bearcoffee.core.BaseResponse;
import java.util.List;

public class TypeCoffeeResponse extends BaseResponse<TypeCoffeeDTO> {
    public TypeCoffeeResponse(Page<TypeCoffeeDTO> toPageDTO) {
        super(toPageDTO);
    }

    public TypeCoffeeResponse(List<TypeCoffeeDTO> toListDTO) {
        super(toListDTO);
    }

    public TypeCoffeeResponse(TypeCoffeeDTO toDTO) {
        super(toDTO);
    }

    public TypeCoffeeResponse() {
        super();
    }
}
