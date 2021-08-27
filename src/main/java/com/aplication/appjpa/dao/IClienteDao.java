package com.aplication.appjpa.dao;

import java.util.List;

import com.aplication.appjpa.models.Cliente;

public interface IClienteDao {
    public List<Cliente> findAll();
}
