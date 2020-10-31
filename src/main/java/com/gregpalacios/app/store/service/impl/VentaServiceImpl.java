package com.gregpalacios.app.store.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gregpalacios.app.store.dto.VentaDetalleVentaDTO;
import com.gregpalacios.app.store.model.DetalleVenta;
import com.gregpalacios.app.store.model.Venta;
import com.gregpalacios.app.store.repo.IDetalleVentaRepo;
import com.gregpalacios.app.store.repo.IGenericRepo;
import com.gregpalacios.app.store.repo.IVentaRepo;
import com.gregpalacios.app.store.service.IVentaService;

@Service
public class VentaServiceImpl extends CRUDImpl<Venta, Integer> implements IVentaService {

	@Autowired
	private IVentaRepo repo;
	
	@Autowired
	private IDetalleVentaRepo detRepo;

	@Override
	protected IGenericRepo<Venta, Integer> getRepo() {
		return repo;
	}
	
	@Transactional
	@Override
	public Venta registrarTransaccional(VentaDetalleVentaDTO dto) throws Exception {
		Venta cabecera = repo.save(dto.getVenta());
		
		for(DetalleVenta detalle : dto.getList_detalle_venta()) {
			detalle.setVenta(cabecera);
			detRepo.save(detalle);
		}
		
		return cabecera;
	}

}
