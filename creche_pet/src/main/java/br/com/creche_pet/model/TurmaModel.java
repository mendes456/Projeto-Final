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
@Table(name="turma", schema="creche_pet")
public class TurmaModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id_turma")
	private Long idTurma;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="hora_inicio")
	private Timestamp horaInicio;

	@Column(name="hora_fim")
	private Timestamp horaFim;
	
	@Column(name="capacidade")
	private Long capacidade;
	
	
	
	
	
	
	
	
	
	
	

	public Long getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(Long idTurma) {
		this.idTurma = idTurma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Timestamp getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Timestamp horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Timestamp getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(Timestamp horaFim) {
		this.horaFim = horaFim;
	}

	public Long getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Long capacidade) {
		this.capacidade = capacidade;
	}
	
	
	
	
}
