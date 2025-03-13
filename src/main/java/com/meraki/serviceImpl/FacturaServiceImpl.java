package com.meraki.serviceImpl;

import com.meraki.entity.Factura;
import com.meraki.repository.FacturaRepository;
import com.meraki.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    @Override
    public Factura createFactura(Factura factura) {
        return facturaRepository.save(factura);
    }

    @Override
    public List<Factura> getAllFacturas() {
        return facturaRepository.findAll();
    }

    @Override
    public Factura getFacturaById(Long id) {
        return facturaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Factura not found: " + id));
    }
}
