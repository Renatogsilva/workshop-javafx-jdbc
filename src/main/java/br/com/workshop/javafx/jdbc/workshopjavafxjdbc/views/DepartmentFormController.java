package br.com.workshop.javafx.jdbc.workshopjavafxjdbc.views;

import br.com.workshop.javafx.jdbc.workshopjavafxjdbc.model.Department;
import br.com.workshop.javafx.jdbc.workshopjavafxjdbc.service.DepartmentService;
import br.com.workshop.javafx.jdbc.workshopjavafxjdbc.views.util.Constraints;
import br.com.workshop.javafx.jdbc.workshopjavafxjdbc.views.util.Utils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import lombok.Setter;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class DepartmentFormController implements Initializable {

    @Setter
    private Department entity;

    @Setter
    private DepartmentService service;

    private List<DataChangeListner> dataChangeListnerList = new ArrayList<>();

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private Label lbMessageError;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnCancel;

    @FXML
    public void onBtnSaveAction(ActionEvent actionEvent) {
        if (entity == null)
            throw new IllegalStateException("Entity was null");

        if (service == null)
            throw new IllegalStateException("Service was null");

        entity = getFormData();
        service.saveOrUpdate(entity);
        notifyDataChangeListners();
        Utils.currentStage(actionEvent).close();
    }

    @FXML
    public void onBtnCancelAction(ActionEvent actionEvent) {
        Utils.currentStage(actionEvent).close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initializedNodes();
    }

    private void initializedNodes() {
        Constraints.setTextFieldInteger(txtId);
        Constraints.setTextFieldMaxLength(txtName, 60);
    }

    public void updateFormData() {
        if (entity == null)
            throw new IllegalStateException("Entity was null");
        txtId.setText(String.valueOf(entity.getId()));
        txtName.setText(String.valueOf(entity.getName()));
    }

    public Department getFormData() {
        Department department = new Department();

        department.setId(Utils.tryParseToInt(txtId.getText()));
        department.setName(txtName.getText());

        return department;
    }

    public void subcribeDataChangeListner(DataChangeListner dataChangeListner) {
        dataChangeListnerList.add(dataChangeListner);
    }

    public void notifyDataChangeListners() {
        for (DataChangeListner listners : dataChangeListnerList) {
            listners.onDataChanged();
        }
    }
}
