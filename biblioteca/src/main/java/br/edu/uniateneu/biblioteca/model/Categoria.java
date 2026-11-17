package br.edu.uniateneu.biblioteca.model;

import java.text.Normalizer;
import java.util.Arrays;

public enum Categoria {
    FICCAO("Ficção"),
    NAO_FICCAO("Não Ficção"),
    TECNOLOGIA("Tecnologia"),
    CIENCIAS("Ciências"),
    HISTORIA("História"),
    BIOGRAFIA("Biografia"),
    NEGOCIOS("Negócios e Economia"),
    ARTES("Artes e Cultura"),
    ATUALIDADES("Atualidades e Variedades"),
    EDUCACAO("Educação"),
    INFANTOJUVENIL("Infantojuvenil"),
    SAUDE("Saúde e Bem-estar"),
    HQ("Quadrinhos"),
    SUSPENSE("Suspence"),
    ENCICLOPEDIA("Enciclopédia"),
    DRAMA("Drama"),
    ROMANCE("Romance"),
    RECEITA("Receita"),
    MANGA("Mangá");
	private final String descricao;

    Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Categoria fromDescricao(String texto) {
        if (texto == null || texto.isBlank()) {
            throw new IllegalArgumentException("A categoria não pode ser vazia.");
        }

        String buscaNormalizada = normalizar(texto);

        return Arrays.stream(values())
                .filter(c -> normalizar(c.descricao).equals(buscaNormalizada)
                          || normalizar(c.name()).equals(buscaNormalizada))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Categoria não encontrada: " + texto));
    }

    private static String normalizar(String input) {
        return Normalizer.normalize(input.trim(), Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "")
                .toLowerCase();
    }
}
