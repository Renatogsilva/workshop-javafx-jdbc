package br.com.workshop.javafx.jdbc.workshopjavafxjdbc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public enum Core {
    PSCORE(0, "PSCore"),
    TOPAZ(1, "Topaz");

    private Integer id;
    @Getter
    private String descricao;

    public int getId() {
        return id;
    }

    public static Core getById(int id) {
        for (Core tipo : Core.values()) {
            if (tipo.getId() == id) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("ID inválido: " + id);
    }
}
