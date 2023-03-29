package com.example.bearcoffee.module.users.info;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InformationRepository extends JpaRepository<InformationEntity, Long>, JpaSpecificationExecutor<InformationEntity> {
    @Query("SELECT c FROM InformationEntity c WHERE c.fullName = ?1")
    InformationEntity findByName(String name);
    @Query("SELECT c FROM InformationEntity c WHERE c.id = ?1")
    InformationEntity findByIdCate(Long id);
}

