package br.edu.uniateneu.biblioteca.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_livro")
@PrimaryKeyJoinColumn(name = "id_item")
public class Livro extends ItemBiblioteca {

    @Column(name = "autor", nullable = false, length = 120)
    private String autor;

    @Column(name = "isbn", nullable = false, unique = true, length = 20)
    private String isbn;

    @Column(name = "numero_paginas")
    private Integer numeroPaginas;

    
    
    
    public Livro() {}

    public Livro(String titulo, LocalDate dataAquisicao, Boolean disponivel, String autor, String isbn, Integer numeroPaginas) {
        super(titulo, dataAquisicao, disponivel);
        this.autor = autor;
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public Integer getNumeroPaginas() { return numeroPaginas; }
    public void setNumeroPaginas(Integer numeroPaginas) { this.numeroPaginas = numeroPaginas; }
}
