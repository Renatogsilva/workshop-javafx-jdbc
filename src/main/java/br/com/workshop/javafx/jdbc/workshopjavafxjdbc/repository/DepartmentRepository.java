package br.com.workshop.javafx.jdbc.workshopjavafxjdbc.repository;

import br.com.workshop.javafx.jdbc.workshopjavafxjdbc.model.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentRepository {

    private static List<Department> bancoDadosMYSql = new ArrayList<>();

    public List<Department> findAll(){
        return bancoDadosMYSql;
    }

    public void save(Department department){
        bancoDadosMYSql.add(department);
    }

    public void update(Department department){
        bancoDadosMYSql.add(department);
    }
}
