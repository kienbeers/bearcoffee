package com.example.bearcoffee.module.type_coffee;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bearcoffee.exceptions.CustomException;
import com.example.bearcoffee.exceptions.CustomValidationException;
import com.example.bearcoffee.module.type_coffee.service.TypeCoffeeService;

@RestController
@CrossOrigin(origins = "*")
public class TypeCoffeeController {
    @Autowired
    TypeCoffeeService typeCoffeeService;

    @GetMapping("/bearcoffee/typecoffee/all")
    public TypeCoffeeResponse getAll() {
        return new TypeCoffeeResponse(TypeCoffeeMapper.getInstance().toListDTO(typeCoffeeService.findAll()));
    }

    @PostMapping("/bearcoffee/typecoffee")
    public TypeCoffeeResponse create(@Valid @RequestBody TypeCoffeeRequest request, BindingResult bindingResult)
            throws CustomException, CustomValidationException {
        System.out.println("post");
        if (bindingResult.hasErrors()) {
            throw new CustomValidationException(bindingResult.getAllErrors());
        }
        TypeCoffeeEntity postEntity = typeCoffeeService.insert(request);
        return new TypeCoffeeResponse(TypeCoffeeMapper.getInstance().toDTO(postEntity));
    }
}
