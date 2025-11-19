package br.com.workshop.javafx.jdbc.workshopjavafxjdbc.service;

import br.com.workshop.javafx.jdbc.workshopjavafxjdbc.model.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {

    public List<Department> findAll(){
        List<Department> departmentList = new ArrayList<>();
        Department departmentUm = new Department(1, "RH");
        Department departmentDois = new Department(1, "Engenharia");
        Department departmentTres = new Department(1, "Qualidade");
        Department departmentQuatro = new Department(1, "Desenvolvimento");
        Department departmentCinco = new Department(1, "OrtFuit");

        departmentList.add(departmentUm);
        departmentList.add(departmentDois);
        departmentList.add(departmentTres);
        departmentList.add(departmentQuatro);
        departmentList.add(departmentCinco);

        return departmentList;
    }
}
