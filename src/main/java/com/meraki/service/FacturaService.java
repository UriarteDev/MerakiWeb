package com.meraki.service;

import com.meraki.entity.Factura;
import java.util.List;

public interface FacturaService {
    Factura createFactura(Factura factura);
    List<Factura> getAllFacturas();
    Factura getFacturaById(Long id);
}