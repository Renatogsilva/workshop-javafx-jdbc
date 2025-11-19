package br.com.workshop.javafx.jdbc.workshopjavafxjdbc.views.util;

import javafx.scene.control.Alert;

public class Alerts {

    public static void showAlerts(String title, String header, String content, Alert.AlertType type){
        Alert alert = new Alert(type);

        alert.setTitle(title);
        alert.setContentText(content);
        alert.setHeaderText(header);
        alert.show();
    }
}
