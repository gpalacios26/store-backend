package com.gregpalacios.app.store.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gregpalacios.app.store.dto.VentaDetalleVentaDTO;
import com.gregpalacios.app.store.model.Venta;
import com.gregpalacios.app.store.service.IVentaService;

@RestController
@RequestMapping("/ventas")
public class VentaController {

	@Autowired
	private IVentaService service;

	@PostMapping
	public ResponseEntity<Venta> registrar(@Valid @RequestBody VentaDetalleVentaDTO dto) throws Exception {
		Venta obj = service.registrarTransaccional(dto);
		return new ResponseEntity<Venta>(obj, HttpStatus.CREATED);
	}
}
