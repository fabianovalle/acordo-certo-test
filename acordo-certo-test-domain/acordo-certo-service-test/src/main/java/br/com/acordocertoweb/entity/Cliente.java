package br.com.acordocertoweb.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer clienteId;
	private String nome;
	private String genero;

	@ManyToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Habilitacao> habilitacoes;

	public Integer getClienteId() {
		return clienteId;
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
