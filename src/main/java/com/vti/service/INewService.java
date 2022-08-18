package com.vti.service;

import org.springframework.stereotype.Service;

import com.vti.dto.NewDTO;

@Service
public interface INewService {
    NewDTO save(NewDTO newDTO);
    
}
