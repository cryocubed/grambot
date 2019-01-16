package main;

import bots.BotManager;
import bots.IBotManager;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * The app controller per MVC. Handles all logic regarding GUI <-> Model communication.
 */
public class AppController implements Initializable {

  IBotManager botManager = new BotManager();

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
