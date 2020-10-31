package com.gregpalacios.app.store.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gregpalacios.app.store.model.Producto;
import com.gregpalacios.app.store.repo.IGenericRepo;
import com.gregpalacios.app.store.repo.IProductoRepo;
import com.gregpalacios.app.store.service.IProductoService;

@Service
public class ProductoServiceImpl extends CRUDImpl<Producto, Integer> implements IProductoService {

	@Autowired
	private IProductoRepo repo;
	
	@Override
	protected IGenericRepo<Producto, Integer> getRepo() {
		return repo;
	}

}
