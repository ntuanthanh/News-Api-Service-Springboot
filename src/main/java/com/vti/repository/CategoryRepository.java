package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vti.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity,Long>{
   CategoryEntity findOneByCode(String code);
}
