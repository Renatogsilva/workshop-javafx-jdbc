package br.com.workshop.javafx.jdbc.workshopjavafxjdbc.views;

import br.com.workshop.javafx.jdbc.workshopjavafxjdbc.model.Department;
import br.com.workshop.javafx.jdbc.workshopjavafxjdbc.service.DepartmentService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import lombok.Setter;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class DepartmentListController implements Initializable {

    @Setter
    private DepartmentService departmentService;

    @FXML
    private TableView<Department> tableViewDepartmentList;

    @FXML
    private TableColumn<Department, Integer> tableColumnId;

    @FXML
    private TableColumn<Department, String> tableColumnName;

    private ObservableList<Department> observableList;

    @FXML
    public void onBtNewAction() {
        System.out.println("CLICOU BEM AQUI VIU...");
    }

    @FXML
    private Button btnNew;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initializeNodes();
    }

    private void initializeNodes() {
        tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));

        Stage stage = (Stage) MainViewApplication.getMainScene().getWindow();

        tableViewDepartmentList.prefHeightProperty().bind(stage.heightProperty());
    }

    public void updateTableView() {
        if (this.departmentService == null)
            throw new IllegalStateException("Service was null");

        List<Department> departmentList = departmentService.findAll();

        observableList = FXCollections.observableArrayList(departmentList);

        tableViewDepartmentList.setItems(observableList);
    }
}
