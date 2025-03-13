package com.meraki.service;

import com.meraki.entity.ProductCarrito;
import java.util.List;

public interface ProductCarritoService {
    ProductCarrito addProductToCarrito(ProductCarrito productCarrito);
    List<ProductCarrito> getProductsInCarrito(Long userId);
    void removeProductFromCarrito(Long id);
}