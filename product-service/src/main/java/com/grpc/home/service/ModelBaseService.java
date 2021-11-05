package com.grpc.home.service;

import com.grpc.home.dto.ModelBaseDto;

import java.util.List;

public interface ModelBaseService {
    List<ModelBaseDto> findAllProduct();
    ModelBaseDto findByCode(Integer code);
}
