package br.edu.uniateneu.biblioteca.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_item_biblioteca")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ItemBiblioteca {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_item")
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(length = 50)
	private Categoria categoria;

	@Column(name = "titulo", nullable = false, length = 150)
	private String titulo;

	@Column(name = "data_aquisicao", nullable = false)
	private LocalDate dataAquisicao;

	@Column(name = "disponivel", nullable = false)
	private Boolean disponivel = true;

	public ItemBiblioteca() {
	}

	public ItemBiblioteca(String titulo, LocalDate dataAquisicao, Boolean disponivel) {
		this.titulo = titulo;
		this.dataAquisicao = dataAquisicao;
		this.disponivel = disponivel;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(LocalDate dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

	public Boolean getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}
}
