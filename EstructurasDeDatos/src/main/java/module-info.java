module ec.edu.espol.estructurasdedatos {
    requires javafx.controls;
    requires javafx.fxml;

    opens ec.edu.espol.estructurasdedatos to javafx.fxml;
    exports ec.edu.espol.estructurasdedatos;
}
