package com.grpc.home.controller;

import com.grpc.home.GrpcClientService;
import com.grpc.home.dto.ModelBaseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/v1/api")
public class ProductController {

    @Autowired
    private GrpcClientService grpcClientService;

    @ResponseBody
    @GetMapping(path = "/listAllProduct")
    public List<ModelBaseDto> getListAllModel() {
        return grpcClientService.findAllProduct();
    }

    @ResponseBody
    @GetMapping(path = "/getOneProduct/{code}")
    public ModelBaseDto getOneProduct(@PathVariable(name = "code") Integer code) {
        return grpcClientService.findOneProduct(code);
    }
}
