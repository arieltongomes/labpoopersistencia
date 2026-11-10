package br.edu.uniateneu.biblioteca.modelo;
public abstract class ItemBiblioteca {
	private int id;
	private String titulo;
	private String editora;
	private String idioma;
	private Integer numeroPaginas;
	private Integer ano;
	private int edicao;
	private boolean emprestado;
	private String volume;
	private String formato;
	public ItemBiblioteca(int id, String titulo, String editora, String idioma, Integer numeroPaginas,
			Integer ano, int edicao) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.editora = editora;
		this.idioma = idioma;
		this.numeroPaginas = numeroPaginas;
		this.ano = ano;
		this.edicao = edicao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public boolean isEmprestado() {
		return emprestado;
	}
	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}

	public abstract String getTipo();

	@Override
	public String toString() {
		return String.format("[%s] ID: %d | Título: %s | Status: %s",
				getTipo(), id, titulo, (emprestado ? "Emprestado" : "Disponível"));
	}


}
