module br.com.workshop.javafx.jdbc.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.workshop.javafx.jdbc.workshopjavafxjdbc to javafx.fxml;
    exports br.com.workshop.javafx.jdbc.workshopjavafxjdbc;
}