package com.gregpalacios.app.store.service;

import com.gregpalacios.app.store.dto.VentaDetalleVentaDTO;
import com.gregpalacios.app.store.model.Venta;

public interface IVentaService extends ICRUD<Venta, Integer> {

	Venta registrarTransaccional(VentaDetalleVentaDTO dto) throws Exception;
}
