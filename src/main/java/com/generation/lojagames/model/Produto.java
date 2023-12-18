package com.generation.lojagames.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos") // CREATE TABLE tb_produtos
public class Produto {

	@Id // Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
	private Long id;
	
	@Column(length = 100)
	@NotBlank(message = "O Atributo nome é obrigatório!")
	@Size(min = 1, max = 100, message="O Atributo nome deve conter no mínimo 1 e no máximo 100 caracteres.")
	private String nome;
	
	@Column(length = 1000)
	@NotBlank(message = "O Atributo descrição é obrigatório!")
	@Size(min = 10, max = 1000, message="O Atributo descrição deve conter no mínimo 10 e no máximo 1000 caracteres.")
	private String descricao;
	
	@NotBlank(message = "O Atributo preço é obrigatório!")
	private BigDecimal preco;
	
	@UpdateTimestamp
	private LocalDateTime data;
	
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	
}