package com.example.bearcoffee.module.type_coffee;

import java.io.Serializable;

import com.example.bearcoffee.core.BaseDTO;
import com.example.bearcoffee.util.StatusActive;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class TypeCoffeeDTO extends BaseDTO implements Serializable {

    private Long id;

    private String typeName;

    private StatusActive status;

}
