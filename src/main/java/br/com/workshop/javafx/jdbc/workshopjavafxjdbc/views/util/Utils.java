package br.com.workshop.javafx.jdbc.workshopjavafxjdbc.views.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utils {

    public static Stage currentStage(ActionEvent actionEvent) {
        return (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
    }

    public static Integer tryParseToInt(String value) {
        try {
            return Integer.parseInt(value);

        } catch (NumberFormatException e) {
            return null;
        }
    }
}
