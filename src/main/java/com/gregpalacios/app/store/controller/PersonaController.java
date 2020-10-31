package com.gregpalacios.app.store.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gregpalacios.app.store.exception.ModeloNotFoundException;
import com.gregpalacios.app.store.model.Persona;
import com.gregpalacios.app.store.service.IPersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {

	@Autowired
	private IPersonaService service;

	@GetMapping
	public ResponseEntity<List<Persona>> listar() throws Exception {
		List<Persona> lista = service.listar();
		return new ResponseEntity<List<Persona>>(lista, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Persona> listarPorId(@PathVariable("id") Integer id) throws Exception {
		Persona obj = service.listarPorId(id);

		if (obj == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}

		return new ResponseEntity<Persona>(obj, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Persona> registrar(@Valid @RequestBody Persona p) throws Exception {
		Persona obj = service.registrar(p);
		return new ResponseEntity<Persona>(obj, HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Persona> modificar(@Valid @RequestBody Persona p) throws Exception {
		Persona obj = service.modificar(p);
		return new ResponseEntity<Persona>(obj, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception {
		Persona obj = service.listarPorId(id);

		if (obj == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}

		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
