package com.grpc.home.service.impl;

import com.grpc.home.dto.ModelBaseDto;
import com.grpc.home.entity.ModelBaseEntity;
import com.grpc.home.repository.ModelBaseRepository;
import com.grpc.home.service.ModelBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ModelBaseServiceImpl implements ModelBaseService {

    @Autowired
    private ModelBaseRepository modelBaseRepository;

    @Override
    public List<ModelBaseDto> findAllProduct() {
        List<ModelBaseDto> dtoList = new ArrayList<>();
        List<ModelBaseEntity> list = modelBaseRepository.findAll();
        if(list != null && list.size() > 0) {
            for (ModelBaseEntity entity : list) {
                ModelBaseDto dto = ModelBaseDto.builder().code(entity.getCode()).name(entity.getName())
                        .price(entity.getPrice()).status(entity.getStatus()).category(entity.getCategory()).build();
                dtoList.add(dto);
            }
        }
        return dtoList;
    }

    @Override
    public ModelBaseDto findByCode(Integer code) {
        Optional<ModelBaseEntity> entity = modelBaseRepository.findById(code);
        if (entity != null) {
            ModelBaseDto dto = ModelBaseDto.builder().code(entity.get().getCode()).name(entity.get().getName())
                    .price(entity.get().getPrice()).status(entity.get().getStatus()).category(entity.get().getCategory()).build();
            return dto;
        }
        return new ModelBaseDto();
    }
}
