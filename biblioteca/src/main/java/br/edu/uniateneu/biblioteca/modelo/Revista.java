package br.edu.uniateneu.biblioteca.modelo;

public class Revista extends ItemBiblioteca {

	private String issn;
    private String mesAno;

	public Revista(int id, String titulo, String autor, String editora, String idioma, Integer numeroPaginas,
			Integer ano, String issn, int edicao, String mesAno) {
		super(id, titulo, editora, idioma, numeroPaginas, ano, edicao);
		this.setIssn(issn);
        this.mesAno = mesAno;
	}

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}
	
    @Override
    public String getTipo() { return "Revista"; }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Edição: %d | Mês/Ano: %s | ISSN: %s", this.getEdicao(), mesAno, issn);
    }

}
