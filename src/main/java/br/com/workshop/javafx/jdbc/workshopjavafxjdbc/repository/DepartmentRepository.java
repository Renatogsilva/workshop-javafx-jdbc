package br.com.workshop.javafx.jdbc.workshopjavafxjdbc.repository;

import br.com.workshop.javafx.jdbc.workshopjavafxjdbc.model.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentRepository {

    private static List<Department> bancoDadosMYSql = new ArrayList<>();

    public List<Department> findAll(){
        return bancoDadosMYSql;
    }
}
