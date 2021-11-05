package com.grpc.home.repository;

import com.grpc.home.entity.ModelBaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelBaseRepository extends JpaRepository<ModelBaseEntity, Integer> {
}
