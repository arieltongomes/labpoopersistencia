package br.edu.uniateneu.biblioteca.modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {
    private int id;
    private Usuario usuario;
    private ItemBiblioteca item;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevistaDevolucao;
    private LocalDate dataDevolucaoEfetiva;
    private double multa;
    private boolean ativo;

	
	public Emprestimo(int id, Usuario usuario, ItemBiblioteca item, LocalDate dataEmprestimo, int diasPrazo) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.item = item;
		this.dataEmprestimo = dataEmprestimo;
		this.dataPrevistaDevolucao = dataEmprestimo.plusDays(diasPrazo);
		this.ativo = true;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public ItemBiblioteca getItem() {
		return item;
	}
	public void setItem(ItemBiblioteca item) {
		this.item = item;
	}
	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public LocalDate getDataPrevistaDevolucao() {
		return dataPrevistaDevolucao;
	}
	public void setDataPrevistaDevolucao(LocalDate dataPrevistaDevolucao) {
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
	}
	public LocalDate getDataDevolucaoEfetiva() {
		return dataDevolucaoEfetiva;
	}
	public void setDataDevolucaoEfetiva(LocalDate dataDevolucaoEfetiva) {
		this.dataDevolucaoEfetiva = dataDevolucaoEfetiva;
	}
	public double getMulta() {
		return multa;
	}
	public void setMulta(double multa) {
		this.multa = multa;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
    
    public double registrarDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucaoEfetiva = dataDevolucao;
        this.ativo = false;
        this.item.setEmprestado(false);

        if (dataDevolucao.isAfter(dataPrevistaDevolucao)) {
            long diasAtraso = ChronoUnit.DAYS.between(dataPrevistaDevolucao, dataDevolucao);
            this.multa = diasAtraso * 6.00;
        } else {
            this.multa = 0.0;
        }
        return this.multa;
    }
    
    @Override
    public String toString() {
        return String.format(
            "Empréstimo #%d | Usuário: %s | Item: [%s - %s] | Prev. Devolução: %s | Status: %s | Multa: R$ %.2f",
            id, usuario.getNome(), item.getTipo(), item.getTitulo(),
            dataPrevistaDevolucao, (ativo ? "Em aberto" : "Devolvido em " + dataDevolucaoEfetiva), multa
        );
    }
    
    
}
