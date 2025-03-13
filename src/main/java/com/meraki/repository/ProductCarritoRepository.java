package com.meraki.repository;

import com.meraki.entity.ProductCarrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCarritoRepository extends JpaRepository<ProductCarrito, Long> {
    List<ProductCarrito> findByUserId(Long userId);
}