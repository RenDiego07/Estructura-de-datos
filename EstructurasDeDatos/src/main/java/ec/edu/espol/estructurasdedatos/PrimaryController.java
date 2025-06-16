package ec.edu.espol.estructurasdedatos;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    public void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
