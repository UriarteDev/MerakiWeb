package com.meraki.serviceImpl;

import com.meraki.entity.Inventario;
import com.meraki.repository.InventarioRepository;
import com.meraki.service.InventarioService;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventarioServiceImpl implements InventarioService {

    @Autowired
    private InventarioRepository inventarioRepository;

    @Override
    public Inventario saveInventario(Inventario inventario) {
        return inventarioRepository.save(inventario);
    }

    @Override
    public Inventario getInventarioByProductId(Long productId) {
        return inventarioRepository.findByProductId(productId);
    }

    @Override
    public Inventario getInventarioById(Long id) {
        return inventarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Inventario not found: " + id));
    }

    @Override
    public List<Inventario> getAllInventarios() {
        return inventarioRepository.findAll();
    }

    @Override
    public void deleteInventario(Long id) {
        inventarioRepository.deleteById(id);
    }

    @Override
    public void updateInventarioQuantity(Long productId, int quantity) {
        Inventario inventario = inventarioRepository.findByProductId(productId);
        if (inventario != null) {
            inventario.setQuantity(quantity);
            inventario.setLastUpdated(new Date());
            inventarioRepository.save(inventario);
        } else {
            throw new RuntimeException("Inventario not found for product ID: " + productId);
        }
    }
}
