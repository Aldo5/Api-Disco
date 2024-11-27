package com.mx.ApiDisco.service;

import java.util.List;

import com.mx.ApiDisco.model.Discos;

public interface DiscoServicio {

	public List<Discos> listar();
	public void guardar(Discos discos);
	public Discos buscar(Integer id);
	public void editar(Discos discos);
	public void eliminar(Integer id);
}
