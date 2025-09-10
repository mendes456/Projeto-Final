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
@Table(name="pet", schema="creche_pet")
public class PetModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	
	@Column(name="id_pet")
	private Long idPet;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="especie")
	private String especie;
	
	@Column(name="raca")
	private String raca;
	
	@Column(name="data_nascimento")
	private Timestamp dataNascimento;

	@Column(name="peso")
	private Double peso ;
	
	@Column(name="id_dono")
	private Long idDono;
	
	@Column(name="observacoes")
	private String observacoes;
	
	
	

	public Long getIdPet() {
		return idPet;
	}

	public void setIdPet(Long idPet) {
		this.idPet = idPet;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Timestamp getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Timestamp dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Long getIdDono() {
		return idDono;
	}

	public void setIdDono(Long idDono) {
		this.idDono = idDono;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	
	
}
