package com.example.Jinus.repository;

import com.example.Jinus.entity.MarsciCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarsciCategoryRepository extends JpaRepository<MarsciCategoryEntity, Integer> {
    List<MarsciCategoryEntity> findByDepartmentId(int departmentId);
}
