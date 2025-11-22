package br.com.workshop.javafx.jdbc.workshopjavafxjdbc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public enum Tipo {
    PESSOA_FISICA_COMPRADOR(0, "PF Comprador"),
    PESSOA_FISICA_VENDEDOR(1, "PF Vendedor"),
    PESSOA_JURIDICA(2, "PJ Empresarial");

    private Integer id;
    @Getter
    private String descricao;

    public int getId() {
        return id;
    }

    public static Tipo getById(int id) {
        for (Tipo tipo : Tipo.values()) {
            if (tipo.getId() == id) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("ID inválido: " + id);
    }
}
