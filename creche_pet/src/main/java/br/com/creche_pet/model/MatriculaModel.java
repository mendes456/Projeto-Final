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
@Table(name="matricula", schema="creche_pet")
public class MatriculaModel implements Serializable {

	

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	@Column(name="id_matricula")
	private Long idMatricula;
	
	@Column(name="id_pet")
	private Long idPet;
	
	@Column(name="id_turma")
	private Long idTurma;
	
	@Column(name="data_matricula")
	private Timestamp dataMatricula;
	
	@Column(name="ativo")
	private Long ativo;
	
	
	

	public Long getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(Long idMatricula) {
		this.idMatricula = idMatricula;
	}

	public Long getIdPet() {
		return idPet;
	}

	public void setIdPet(Long idPet) {
		this.idPet = idPet;
	}

	public Long getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(Long idTurma) {
		this.idTurma = idTurma;
	}

	public Timestamp getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(Timestamp dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public Long getAtivo() {
		return ativo;
	}

	public void setAtivo(Long ativo) {
		this.ativo = ativo;
	}
	
	
	
}
