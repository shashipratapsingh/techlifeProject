package com.smart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.entities.AddsubcatagoryEntity;
@Repository
public interface Subcatagory extends JpaRepository<AddsubcatagoryEntity, Integer>{

}
