package com.example.Jinus.repository.notice;

import com.example.Jinus.entity.notice.ItCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItCategoryRepository extends JpaRepository<ItCategoryEntity, Integer> {
    List<ItCategoryEntity> findByDepartmentId(int departmentId);
}
