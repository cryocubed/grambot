package view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AppController implements Initializable {

  @FXML
  private Label lblToCopyTo;

  @FXML
  private TextField txtToCopyFrom;

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    String javaVersion = System.getProperty("java.version");
    String javafxVersion = System.getProperty("javafx.version");
    lblToCopyTo
        .setText("Hello, JavaFX " + javafxVersion + "\nRunning on Java " + javaVersion + ".");
  }

  public void transferText() {
    lblToCopyTo.setText(txtToCopyFrom.getText());
  }
}
