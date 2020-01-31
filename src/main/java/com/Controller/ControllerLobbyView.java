package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerLobbyView {


    public ControllerLobbyView() {}

    public void handleSellerListButton(ActionEvent actionEvent) {
        try {
            Stage st = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/SellerView.fxml"));
            Region root = loader.load();
            Node node = (Node) actionEvent.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            //Fermeture de celle-ci
            stage.close();

            Scene scene = new Scene(root);
            st.setScene(scene);
            st.initModality(Modality.APPLICATION_MODAL);
            st.setResizable(false);
            st.setTitle("Seller List");
            st.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handleDepartmentListButton(ActionEvent actionEvent) {
        try {
            Stage st = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/ShopView.fxml"));
            Region root = loader.load();
            Node node = (Node) actionEvent.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            //Fermeture de celle-ci
            stage.close();

            Scene scene = new Scene(root);
            st.setScene(scene);
            st.initModality(Modality.APPLICATION_MODAL);
            st.setResizable(false);
            st.setTitle("Shop");
            st.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
