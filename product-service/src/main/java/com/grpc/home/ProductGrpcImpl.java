package com.grpc.home;

import com.grpc.home.dto.ModelBaseDto;
import com.grpc.home.service.ModelBaseService;
import com.grpc.product.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@GrpcService
public class ProductGrpcImpl extends ProductServiceGrpc.ProductServiceImplBase {

    @Autowired
    private ModelBaseService modelBaseService;

    @Override
    public void findAllProduct(emptyRequest request, StreamObserver<ModelResponse> responseObserver) {
        List<ModelBaseDto> dtoList = modelBaseService.findAllProduct();
        if (dtoList != null && dtoList.size() > 0) {
            List<ModelResponse.ModelBase> baseList = new ArrayList<>();
            for (ModelBaseDto dto : dtoList) {
                ModelResponse.ModelBase base = ModelResponse.ModelBase.newBuilder().setCode(dto.getCode()).setName(dto.getName())
                        .setPrice(dto.getPrice()).setStatus(dto.getStatus()).setCategory(dto.getCategory()).build();
                baseList.add(base);
            }
            ModelResponse response = ModelResponse.newBuilder().addAllModelBase(baseList).build();
            responseObserver.onNext(response);
        } else {
            ModelResponse response = ModelResponse.newBuilder().addAllModelBase(new ArrayList<>()).build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void findOneProduct(ModelRequest request, StreamObserver<ModelOneRespone> responseObserver) {
        ModelBaseDto dto = modelBaseService.findByCode(request.getCode());
        ModelOneRespone response;
        if (dto != null) {
            response = ModelOneRespone.newBuilder().setCode(dto.getCode()).setName(dto.getName())
                    .setPrice(dto.getPrice()).setStatus(dto.getStatus()).setCategory(dto.getCategory()).build();
        } else {
            response = ModelOneRespone.newBuilder().build();
        }
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
