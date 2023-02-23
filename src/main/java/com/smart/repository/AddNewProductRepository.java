package com.smart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.smart.entities.NewProductAddEntity;
@Repository
public interface AddNewProductRepository extends JpaRepository<NewProductAddEntity, Integer>{

}
