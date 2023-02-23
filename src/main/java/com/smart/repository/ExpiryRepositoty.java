package com.smart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.entities.ExpiryEntity;

@Repository
public interface ExpiryRepositoty extends JpaRepository<ExpiryEntity, Integer>{

}
