package org.ada.mypocketbalance.service;

import org.ada.mypocketbalance.dto.DetalleFacturaDTO;
import org.ada.mypocketbalance.dto.FacturaDTO;
import org.ada.mypocketbalance.entity.DetalleFactura;
import org.ada.mypocketbalance.repository.DetalleFacturaRepository;
import org.springframework.stereotype.Service;

@Service
public class DetalleFacturaService {

    private final DetalleFacturaRepository detalleFacturaRepository;

    public DetalleFacturaService(DetalleFacturaRepository detalleFacturaRepository) {
        this.detalleFacturaRepository = detalleFacturaRepository;
    }

    public void create(DetalleFacturaDTO detalleFacturaDTO) {
    }


}
