package br.edu.uniateneu.biblioteca.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

	@Entity
	@Table(name = "tb_revista")
	@DiscriminatorValue("Revista")
	@PrimaryKeyJoinColumn(name = "item_id")
	public class Revista extends ItemBiblioteca {

	    @Column(length = 20)
	    private String issn;

	    @Column(name = "mes_ano", length = 20)
	    private String mesAno;

	    // Construtor sem argumentos exigido pelo JPA
	    public Revista() {
	        super();
	    }

	    public Revista(int id, String titulo, String autor, String editora, String idioma, Integer numeroPaginas,
	            Integer ano, String issn, int edicao, String mesAno) {
	        super(id, titulo, editora, idioma, numeroPaginas, ano, edicao);
	        this.issn = issn;
	        this.mesAno = mesAno;
	    }

	    public String getIssn() {
	        return issn;
	    }

	    public void setIssn(String issn) {
	        this.issn = issn;
	    }

	    public String getMesAno() {
	        return mesAno;
	    }

	    public void setMesAno(String mesAno) {
	        this.mesAno = mesAno;
	    }

	    @Override
	    public String getTipo() {
	        return "Revista";
	    }

	    @Override
	    public String toString() {
	        return super.toString() + String.format(" | Edição: %d | Mês/Ano: %s | ISSN: %s", this.getEdicao(), mesAno, issn);
	    }
	}
