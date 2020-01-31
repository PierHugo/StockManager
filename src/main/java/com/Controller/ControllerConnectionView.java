package Controller;

import Main.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerConnectionView {

    private Main main;


    @FXML
    private TextField connectionField;

    @FXML
    private Button loginButton;

    public ControllerConnectionView() {

    };

    public void setMain (Main main) {
        this.main = main;
    }

    public void handleLoginButton(ActionEvent actionEvent) {
        try {
            Stage st = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/LobbyView.fxml"));
            Region root = loader.load();
            Node node = (Node) actionEvent.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            //Fermeture de celle-ci
            stage.close();

            Scene scene = new Scene(root);
            st.setScene(scene);
            st.initModality(Modality.APPLICATION_MODAL);
            st.setResizable(false);
            st.setTitle("Lobby");
            st.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
