package br.com.acordocertoweb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "habilitacao")
public class Habilitacao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer habilitacaoId;
	private String tipo;
	@ManyToOne
	@JoinColumn(name = "clienteId")
	@JsonBackReference
	private Cliente cliente;

	public Integer getHabilitacaoId() {
		return habilitacaoId;
	}

	public String getTipo() {
		return tipo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setHabilitacaoId(Integer habilitacaoId) {
		this.habilitacaoId = habilitacaoId;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
