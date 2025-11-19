package br.com.workshop.javafx.jdbc.workshopjavafxjdbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Department implements Serializable {
    private static final long serialVersionLOUID = 1L;

    private Integer id;
    private String name;
}
