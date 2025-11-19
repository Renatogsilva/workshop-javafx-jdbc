package br.com.workshop.javafx.jdbc.workshopjavafxjdbc.service;

import br.com.workshop.javafx.jdbc.workshopjavafxjdbc.model.Department;
import br.com.workshop.javafx.jdbc.workshopjavafxjdbc.repository.DepartmentRepository;

import java.util.List;

public class DepartmentService {

    private final DepartmentRepository departmentRepository = new DepartmentRepository();

    public List<Department> findAll() {

        return departmentRepository.findAll();
    }
}
