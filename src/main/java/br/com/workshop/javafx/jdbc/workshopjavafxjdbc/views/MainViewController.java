package br.com.workshop.javafx.jdbc.workshopjavafxjdbc.views;

import br.com.workshop.javafx.jdbc.workshopjavafxjdbc.service.DepartmentService;
import br.com.workshop.javafx.jdbc.workshopjavafxjdbc.views.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;

public class MainViewController implements Initializable {

    @FXML
    private MenuItem menuItemSeller;

    @FXML
    private MenuItem menuItemDepartmen;

    @FXML
    private MenuItem menuItemAbout;

    @FXML
    public void onMenuItemSellerAction() {
    }

    @FXML
    public void onMenuItemDepartmentAction() {
        loadView("DepartmentListView.fxml", (DepartmentListController controller) -> {
            controller.setDepartmentService(new DepartmentService());
            controller.updateTableView();
        });
    }

    @FXML
    public void onMenuItemAboutAction() {
        loadView("AboutView.fxml", x -> {
        });
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    private synchronized <T> void loadView(String absolutName, Consumer<T> initializingAction) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(absolutName));
            VBox newVBox = loader.load();

            Scene mainScene = MainViewApplication.getMainScene();
            VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

            Node mainMenu = mainVBox.getChildren().get(0);
            mainVBox.getChildren().clear();
            mainVBox.getChildren().add(mainMenu);
            mainVBox.getChildren().addAll(newVBox.getChildren());

            T controller = loader.getController();
            initializingAction.accept(controller);

        } catch (IOException io) {
            Alerts.showAlerts("IO Exception", "Error loading view", io.getLocalizedMessage(), Alert.AlertType.ERROR);
        }
    }
}
