package com.meraki.service;

import java.util.List;

import com.meraki.entity.Inventario;

public interface InventarioService {
    Inventario saveInventario(Inventario inventario);
    Inventario getInventarioByProductId(Long productId);
    Inventario getInventarioById(Long id); // Añadir este método
    List<Inventario> getAllInventarios(); // Añadir este método
    void deleteInventario(Long id); // Añadir este método
    void updateInventarioQuantity(Long productId, int quantity);
}
