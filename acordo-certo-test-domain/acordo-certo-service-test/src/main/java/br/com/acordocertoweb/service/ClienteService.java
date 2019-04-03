package br.com.acordocertoweb.service;

import java.util.List;

import br.com.acordocertoweb.entity.Cliente;

public interface ClienteService {

	Cliente save(Cliente cliente);
	List<Cliente> getAll();

}
