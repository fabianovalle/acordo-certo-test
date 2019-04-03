package br.com.acordocertoweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.acordocertoweb.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
