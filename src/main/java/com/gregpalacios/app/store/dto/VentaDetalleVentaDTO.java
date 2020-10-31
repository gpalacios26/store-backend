package com.gregpalacios.app.store.dto;

import java.util.List;

import com.gregpalacios.app.store.model.DetalleVenta;
import com.gregpalacios.app.store.model.Venta;

public class VentaDetalleVentaDTO {

	private Venta venta;
	
	private List<DetalleVenta> list_detalle_venta;

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public List<DetalleVenta> getList_detalle_venta() {
		return list_detalle_venta;
	}

	public void setList_detalle_venta(List<DetalleVenta> list_detalle_venta) {
		this.list_detalle_venta = list_detalle_venta;
	}
	
}
