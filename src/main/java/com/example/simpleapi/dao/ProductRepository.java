package com.example.simpleapi.dao;

import com.example.simpleapi.model.product;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = true)

public interface ProductRepository extends JpaRepository<product, Long> {
    @Transactional
    @Modifying
    @Query("DELETE FROM product p WHERE p.id=:id")
    void deleteById(@Param("id")Long id);
}
