package com.example.bearcoffee.module.type_coffee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.bearcoffee.core.BaseEntity;
import com.example.bearcoffee.util.StatusActive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "type_coffee")
public class TypeCoffeeEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type_name")
    private String typeName;

    @Column(name = "status")
    private StatusActive status;

    public void setData(TypeCoffeeRequest request) {
        typeName = request.getTypeName();
    }
}
