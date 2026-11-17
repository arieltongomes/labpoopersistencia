package br.edu.uniateneu.biblioteca.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_revista")
@PrimaryKeyJoinColumn(name = "id_item")
public class Revista extends ItemBiblioteca {

    @Column(name = "edicao", nullable = false)
    private Integer edicao;

    @Column(name = "issn", length = 15)
    private String issn;

    @Column(name = "mes_ano_publicacao", length = 20)
    private String mesAnoPublicacao;

    public Revista() {}

    public Revista(String titulo, LocalDate dataAquisicao, Boolean disponivel, Integer edicao, String issn, String mesAnoPublicacao) {
        super(titulo, dataAquisicao, disponivel);
        this.edicao = edicao;
        this.issn = issn;
        this.mesAnoPublicacao = mesAnoPublicacao;
    }

    public Integer getEdicao() { return edicao; }
    public void setEdicao(Integer edicao) { this.edicao = edicao; }

    public String getIssn() { return issn; }
    public void setIssn(String issn) { this.issn = issn; }

    public String getMesAnoPublicacao() { return mesAnoPublicacao; }
    public void setMesAnoPublicacao(String mesAnoPublicacao) { this.mesAnoPublicacao = mesAnoPublicacao; }
}
