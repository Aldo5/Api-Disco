package com.mx.ApiDisco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.ApiDisco.dao.DiscoDao;
import com.mx.ApiDisco.model.Discos;

@Service
public class DiscoImplementacion implements DiscoServicio {
	@Autowired
	DiscoDao discoDao;
	
	@Transactional(readOnly = true) //No va a realizar cambios a la bda
	
	@Override
	public List<Discos> listar() {
		// TODO Auto-generated method stub
		//List <Comidas> listaRegistrosbd =  comidaDao.findAll();
		return discoDao.findAll();//listaRegistrosbd;
	}
	
	@Transactional
	@Override
	public void guardar(Discos disco) {
		// TODO Auto-generated method stub
		discoDao.save(disco);
	}

	@Transactional(readOnly = true)
	@Override
	public Discos buscar(Integer id) {
		// TODO Auto-generated method stub
		return discoDao.findById(id).orElse(null);
	}
	@Transactional
	@Override
	public void editar(Discos disco) {
		// TODO Auto-generated method stub
		discoDao.save(disco);
	}
	@Transactional
	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		discoDao.deleteById(id);
	}

}
