package br.edu.uniateneu.biblioteca.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_livro")
@DiscriminatorValue("Livro")
@PrimaryKeyJoinColumn(name = "item_id")
public class Livro extends ItemBiblioteca {

    @Column(length = 20)
    private String isbn;

    @Column(length = 150)
    private String autor;

    // Construtor sem argumentos exigido pelo JPA
    public Livro() {
        super();
    }

    public Livro(int id, String titulo, String autor, String editora, String idioma, Integer numeroPaginas, Integer ano,
            int edicao, String isbn) {
        super(id, titulo, editora, idioma, numeroPaginas, ano, edicao);
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String getTipo() {
        return "Livro"; 
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Autor: %s | ISBN: %s", autor, isbn);
    }
}