module com.example.demo110 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.demo110 to javafx.fxml;
    exports com.example.demo110;
}