package com.meraki.serviceImpl;

import com.meraki.entity.ProductCarrito;
import com.meraki.repository.ProductCarritoRepository;
import com.meraki.service.ProductCarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCarritoServiceImpl implements ProductCarritoService {

    @Autowired
    private ProductCarritoRepository productCarritoRepository;

    @Override
    public ProductCarrito addProductToCarrito(ProductCarrito productCarrito) {
        return productCarritoRepository.save(productCarrito);
    }

    @Override
    public List<ProductCarrito> getProductsInCarrito(Long userId) {
        return productCarritoRepository.findByUserId(userId);
    }

    @Override
    public void removeProductFromCarrito(Long id) {
        productCarritoRepository.deleteById(id);
    }
}