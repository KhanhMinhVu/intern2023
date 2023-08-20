package com.example.interntest.repository;

import com.example.interntest.entity.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReceiptRepository extends JpaRepository<Receipt, Long> {
    List<Receipt> findAllByIdBetweenAndActiveIsTrue (Long before , Long after);
}
