package br.com.acordocertoweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.acordocertoweb.entity.Cliente;
import br.com.acordocertoweb.repository.ClienteRepository;

@Component
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteRepository clienteRepository;

	@Override
	public Cliente save(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public List<Cliente> getAll() {
		return clienteRepository.findAll();
	}

}
