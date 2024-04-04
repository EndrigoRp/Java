package br.com.alura.screenmatch.model;

public enum Categoria {
    ACTION("Ação"),
    ROMANCE("Romance"),
    COMEDY("Comédia"),
    DRAMA("Drama"),
    CRIME("Crime"),
    THRILLER("Thriller"),
    ADVENTURE("Aventura"),
    SUSPENSE("Suspense");

    private String categoriaOmdb;

    Categoria(String categoriaOmdb){
        this.categoriaOmdb = categoriaOmdb;
    }

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }
}
