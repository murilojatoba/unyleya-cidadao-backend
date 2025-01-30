package com.github.murilojatoba.unyleya_cidadao_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cidadao", schema="cidadao")
public class Cidadao {

	@Id
	@GeneratedValue(generator = "tb_cidadao_seq")
	@Column(name = "id_cidadao", nullable = false)
	private Long id;
	
	@Column(name = "ds_nome", nullable = false)
	private String nome;
	
	@Column(name = "nr_cpf", nullable = false)
	private String cpf;
	
	@Column(name = "cd_sexo", nullable = false)
	private String sexo;
	
	@Column(name = "ds_endereco", nullable = false)
	private String endereco;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}	
}
