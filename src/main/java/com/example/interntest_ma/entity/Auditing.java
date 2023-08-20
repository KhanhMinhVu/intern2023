package com.example.interntest_ma.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@MappedSuperclass

public class Auditing implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @CreatedDate
    LocalDateTime createDate;

    @LastModifiedDate
    LocalDateTime updateData;

    boolean active = true;

}
