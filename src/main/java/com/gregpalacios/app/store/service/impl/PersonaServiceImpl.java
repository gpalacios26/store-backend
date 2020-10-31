package com.gregpalacios.app.store.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gregpalacios.app.store.model.Persona;
import com.gregpalacios.app.store.repo.IGenericRepo;
import com.gregpalacios.app.store.repo.IPersonaRepo;
import com.gregpalacios.app.store.service.IPersonaService;

@Service
public class PersonaServiceImpl extends CRUDImpl<Persona, Integer> implements IPersonaService {

	@Autowired
	private IPersonaRepo repo;
	
	@Override
	protected IGenericRepo<Persona, Integer> getRepo() {
		return repo;
	}

}
