package br.com.creche_pet.model;

import java.io.Serializable;
import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mensalidade", schema="creche_pet")
public class MensalidadeModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	@Column(name="id_mensalidade")
	private Long idMensalidade;
	
	@Column(name="id_matricula")
	private Long idMatricula;
	
	@Column(name="valor")
	private Double valor;
	
	@Column(name="data_vencimento")
	private Timestamp dataVencimento;
	
	@Column(name="data_pagamento")
	private Timestamp dataPagamento;
	
	
	

	public Long getIdMensalidade() {
		return idMensalidade;
	}

	public void setIdMensalidade(Long idMensalidade) {
		this.idMensalidade = idMensalidade;
	}

	public Long getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(Long idMatricula) {
		this.idMatricula = idMatricula;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Timestamp getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Timestamp dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Timestamp getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Timestamp dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	

}
