package com.example.demo110;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.math.BigDecimal;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    public TextField xField;

    @FXML
    protected void onHelloButtonClick() {
        Double xCoordinate;
        BigDecimal potential;
        BigDecimal zeroPotential = BigDecimal.valueOf(14.9310180813143);
        xCoordinate = Double.parseDouble(xField.getText());
        //welcomeText.setText(coordinate);
        potential = zeroPotential.subtract(BigDecimal.valueOf((1.7863643702E-5 + (3.5725152499E-5 - 0.427E-9)*xCoordinate/(1.919794E-4))));
        welcomeText.setText(potential.toPlainString());
    }
}