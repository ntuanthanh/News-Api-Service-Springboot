package com.vti.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.vti.converter.NewConverter;
import com.vti.dto.NewDTO;
import com.vti.entity.CategoryEntity;
import com.vti.entity.NewEntity;
import com.vti.repository.CategoryRepository;
import com.vti.repository.NewRepository;
import com.vti.service.INewService;

public class NewService implements INewService{
    @Autowired
    private NewRepository newRepository;

    @Autowired
    private CategoryRepository categoryRepository; 
    
    @Autowired
    private NewConverter newConverter; 
    
	@Override
	public NewDTO save(NewDTO newDTO) {
		CategoryEntity categoryEntity = categoryRepository.findOneByCode(newDTO.getCategoryCode());
		NewEntity newEntity = newConverter.toEntity(newDTO); 
		newEntity.setCategory(categoryEntity);
		newEntity = newRepository.save(newEntity); 
		return newConverter.toDTO(newEntity);
	} 
    
}
