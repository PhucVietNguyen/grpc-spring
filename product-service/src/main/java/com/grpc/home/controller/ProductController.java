package com.grpc.home.controller;

import com.grpc.home.dto.ModelBaseDto;
import com.grpc.home.service.ModelBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class ProductController {

    @Autowired
    private ModelBaseService modelBaseService;

    @ResponseBody
    @GetMapping(path = "/listAllProduct")
    public List<ModelBaseDto> getListAllModel() {
        return modelBaseService.findAllProduct();
    }

    @ResponseBody
    @GetMapping(path = "/getOneProduct/{code}")
    public ModelBaseDto getOneProduct(@PathVariable(name = "code") Integer code) {
        return modelBaseService.findByCode(code);
    }
}
