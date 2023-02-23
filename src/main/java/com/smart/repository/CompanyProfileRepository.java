package com.smart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.entities.CompanyProfileEntity;
@Repository
public interface CompanyProfileRepository extends JpaRepository<CompanyProfileEntity, Integer>{

}
