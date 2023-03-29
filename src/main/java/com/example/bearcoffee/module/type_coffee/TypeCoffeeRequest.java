package com.example.bearcoffee.module.type_coffee;

import javax.validation.constraints.NotBlank;

import com.example.bearcoffee.util.StatusActive;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeCoffeeRequest {
    @NotBlank(message = "Không được để trống")
    private String typeName;
}
