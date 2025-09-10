package br.com.creche_pet.model;

import java.io.Serializable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="funcionario", schema="creche_pet")
public class FuncionarioModel implements Serializable {
	

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	@Column(name="id_funcionario")
	private Long idFuncionrio;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="sobrenome")
	private String sobrenome;
	
	@Column(name="cpf")
	private String cpf;
	
	@Column(name="telefone")
	private String telefone;
	
	@Column(name="email")
	private String email;
	
	@Column(name="id_cargo")
	private Long idCargo;
	
	@Column(name="id_endereco")
	private Long idEndereco;
	
	
	
	
	

	public Long getIdFuncionrio() {
		return idFuncionrio;
	}

	public void setIdFuncionrio(Long idFuncionrio) {
		this.idFuncionrio = idFuncionrio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(Long idCargo) {
		this.idCargo = idCargo;
	}

	public Long getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}

	
	
}
