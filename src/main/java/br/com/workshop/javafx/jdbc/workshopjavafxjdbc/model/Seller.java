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
public class Seller implements Serializable {
    private static final long serialVersionLOUID = 1L;

    private Integer id;
    private String name;
    private String email;
    private String birthDate;
    private Double baseSalary;
}
