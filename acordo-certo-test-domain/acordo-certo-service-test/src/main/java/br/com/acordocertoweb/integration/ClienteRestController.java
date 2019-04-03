package br.com.acordocertoweb.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.acordocertoweb.entity.Cliente;
import br.com.acordocertoweb.service.ClienteService;

@RestController
@CrossOrigin
public class ClienteRestController {

	@Autowired
	ClienteService clienteService;

	@RequestMapping(value = "/getAllClient", method = RequestMethod.GET)
	public List<Cliente> getAllClients() {
		List<Cliente> clients = clienteService.getAll();
		return clients;
	}

	@Transactional
	@RequestMapping(value = "/saveOneClient", method = RequestMethod.POST)
	public Cliente saveOneClient(@RequestBody Cliente client) {
		return clienteService.save(client);
	}

}
