package com.smart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.entities.AddSubsubCategoryEntity;
@Repository
public interface SubsubcatetoryRepository extends JpaRepository<AddSubsubCategoryEntity,Integer>{

}
