package br.edu.uniateneu.biblioteca.modelo;

public class Livro extends ItemBiblioteca {

	private String isbn;
	private String autor;

	public Livro(int id, String titulo, String autor, String editora, String idioma, Integer numeroPaginas, Integer ano,
			int edicao, String isbn) {
		super(id, titulo, editora, idioma, numeroPaginas, ano, edicao);
		this.setIsbn(isbn);
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
