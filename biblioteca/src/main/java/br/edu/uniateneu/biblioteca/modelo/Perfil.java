package br.edu.uniateneu.biblioteca.modelo;

public enum Perfil {
    ADMINISTRADOR(1, "ROLE_ADMINISTRADOR", "Administrador"),
    PROFESSOR(2, "ROLE_PROFESSOR", "Professor"),
    ALUNO(3, "ROLE_ALUNO", "Aluno"),
    FUNCIONARIO(4, "ROLE_FUNCIONARIO", "Funcionário");

    private final Integer codigo;
    private final String role;
    private final String descricao;

    Perfil(Integer codigo, String role, String descricao) {
        this.codigo = codigo;
        this.role = role;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getRole() {
        return role;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Perfil toEnum(Integer codigo) {
        if (codigo == null) {
            return null;
        }

        for (Perfil perfil : Perfil.values()) {
            if (codigo.equals(perfil.getCodigo())) {
                return perfil;
            }
        }

        throw new IllegalArgumentException("Código de perfil inválido: " + codigo);
    }
}