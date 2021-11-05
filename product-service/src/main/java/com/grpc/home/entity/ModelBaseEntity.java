package com.grpc.home.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;


@Table(name = "modelbase")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ModelBaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code")
    private Integer code;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private String price;
    @Column(name = "total")
    private Integer total;
    @Column(name = "status")
    private String status;
    @Column(name = "category")
    private String category;
}
