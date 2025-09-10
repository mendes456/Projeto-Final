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
@Table(name="frequencia", schema="creche_pet")
public class FrequenciaModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id_frequencia")
	private Long idFrequencia;
	
	@Column(name="id_matricula")
	private Long idMatricula;
	
	@Column(name="data")
	private Timestamp data;
	
	@Column(name="status")
	private String status;
	
	
	
	

	public Long getIdFrequencia() {
		return idFrequencia;
	}

	public void setIdFrequencia(Long idFrequencia) {
		this.idFrequencia = idFrequencia;
	}

	public Long getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(Long idMatricula) {
		this.idMatricula = idMatricula;
	}

	public Timestamp getData() {
		return data;
	}

	public void setData(Timestamp data) {
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
