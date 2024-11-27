package com.mx.ApiDisco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.ApiDisco.model.Discos;
import com.mx.ApiDisco.service.DiscoImplementacion;



@RestController
@RequestMapping(path = "DiscoWebService")
@CrossOrigin
public class DiscoWebService {
	
	@Autowired
	DiscoImplementacion imp;
		
	@GetMapping (path= "listar")
	public List<Discos> listar(){
		return imp.listar();
	}
	@PostMapping(path = "guardar")
	public void guardar(@RequestBody Discos disco) {
		imp.guardar(disco);
	}
	
	@PostMapping(path="buscar")
	public Discos buscar(@RequestBody Discos disco) {
		return imp.buscar(disco.getIdD());
		
	}
	
	@PostMapping(path = "editar")
	public void editar(@RequestBody Discos disco) {
		imp.editar(disco);
		
	}
	
	@PostMapping (path="eliminar")
	public void eliminar(@RequestBody Discos disco) {
		imp.eliminar(disco.getIdD());
	}
}

