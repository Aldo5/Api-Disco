package com.mx.ApiDisco.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.ApiDisco.model.Discos;


public interface DiscoDao extends JpaRepository<Discos, Integer> {

}
