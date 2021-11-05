package com.grpc.home.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ModelBaseDto {
    private Integer code;
    private String name;
    private String price;
    private Integer total;
    private String status;
    private String category;
}
