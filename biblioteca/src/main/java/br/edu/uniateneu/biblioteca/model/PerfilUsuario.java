package br.edu.uniateneu.biblioteca.model;

public enum PerfilUsuario {
    FUNCIONARIO("ROLE_FUNCIONARIO", "Funcionário"),
    ALUNO("ROLE_ALUNO", "Aluno"),
    PROFESSOR("ROLE_PROFESSOR", "Professor");

    private final String role;
    private final String descricao;

    PerfilUsuario(String role, String descricao) {
        this.role = role;
        this.descricao = descricao;
    }

    public String getRole() {
        return role;
    }

    public String getDescricao() {
        return descricao;
    }
}