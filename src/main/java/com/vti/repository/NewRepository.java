package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vti.entity.NewEntity;

// Serializable thứ 2 : kiểu dữ liệu của primary key của cái bảng đó 
public interface NewRepository extends JpaRepository<NewEntity, Long> {

}
