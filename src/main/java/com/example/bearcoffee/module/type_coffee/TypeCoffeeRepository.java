package com.example.bearcoffee.module.type_coffee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeCoffeeRepository
        extends JpaRepository<TypeCoffeeEntity, Long>, JpaSpecificationExecutor<TypeCoffeeEntity> {
    // @Query("SELECT c FROM CategoryEntity c WHERE c.name = ?1")
    // TypeCoffeeEntity findByName(String name);

    // @Query("SELECT c FROM CategoryEntity c WHERE c.id = ?1")
    // TypeCoffeeEntity findByIdCate(Long id);
}
