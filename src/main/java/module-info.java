module br.com.workshop.javafx.jdbc.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires static lombok;


    opens br.com.workshop.javafx.jdbc.workshopjavafxjdbc.views to javafx.fxml;
    opens br.com.workshop.javafx.jdbc.workshopjavafxjdbc.model to javafx.base;
    exports br.com.workshop.javafx.jdbc.workshopjavafxjdbc.views;
}