package com.grpc.home;

import com.grpc.home.dto.ModelBaseDto;
import com.grpc.product.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GrpcClientService {

    public List<ModelBaseDto> findAllProduct() {

        List<ModelBaseDto> dtoList = new ArrayList<>();
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8881)
                .usePlaintext()
                .build();
        ProductServiceGrpc.ProductServiceBlockingStub stub = ProductServiceGrpc.newBlockingStub(channel);
        ModelResponse response = stub.findAllProduct(emptyRequest.newBuilder().build());
        List<ModelResponse.ModelBase> baseList = response.getModelBaseList();
        if (baseList != null && baseList.size() > 0) {
            for(ModelResponse.ModelBase base : baseList) {
                ModelBaseDto dto = ModelBaseDto.builder().code(base.getCode()).name(base.getName())
                        .price(base.getPrice()).status(base.getStatus()).category(base.getCategory()).build();
                dtoList.add(dto);
            }
        }
        channel.shutdown();
        return dtoList;
    }

    public ModelBaseDto findOneProduct(Integer code) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8881)
                .usePlaintext()
                .build();
        ProductServiceGrpc.ProductServiceBlockingStub stub = ProductServiceGrpc.newBlockingStub(channel);
        ModelOneRespone response = stub.findOneProduct(ModelRequest.newBuilder().setCode(code).build());
        ModelBaseDto dto = null;
        if(response != null) {
            dto = ModelBaseDto.builder().code(response.getCode()).name(response.getName()).price(response.getPrice())
                    .status(response.getStatus()).category(response.getCategory()).build();
        }
        return dto;
    }
}
