package Controller;

import Main.Main;
import Model.Seller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerSellerView {

    private Main main;

    public boolean showPersonEditDialog(Seller seller) {
        try {
            // Load the fxml file and create a new stage for the popup dialog.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/View/SellerEditDialog.fxml"));
            AnchorPane page = (AnchorPane) loader.load();

            // Create the dialog Stage.
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Edit Person");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(main.getPrimaryStage());
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            // Set the person into the controller.
            ControllerSellerEditDialog controller = loader.getController();
            controller.setDialogStage(dialogStage);
            controller.setSeller(seller);

            // Show the dialog and wait until the user closes it
            dialogStage.showAndWait();

            return controller.isOkClicked();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    public void handleLobbyButton(ActionEvent actionEvent) {
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

