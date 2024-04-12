package com.example.Jinus.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


// 사범대학
@Entity
@Getter
@Setter
@Table(name = "sadae-category")
public class SadaeCategoryEntity {
    @Id
    private int id;

    @Column(name = "category")
    private String category;

    @Column(name = "department_id")
    private int departmentId;

    @Column(name = "mi")
    private int mi;

    @Column(name = "bbs_id")
    private int bbsId;
}
