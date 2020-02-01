package Controller;

import DAO.DAOSeller;
import Main.Main;
import Model.Seller;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import java.io.IOException;

public class ControllerSellerView {

    public static EntityManager em;

    @FXML
    private TableView<Seller> sellerTable;
    @FXML
    private TableColumn<Seller, String> firstNameColumn;
    @FXML
    private TableColumn<Seller, String> lastNameColumn;
    @FXML
    private Label firstNameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label mailLabel;
    @FXML
    private Label departmentNameLabel;

    private Main main;
    private DAOSeller daoSeller = new DAOSeller(em);


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

    private void showSellerDetails(Seller seller) {
        if (seller != null) {
            // Fill the labels with info from the person object.
            firstNameLabel.setText(seller.getFirstName());
            lastNameLabel.setText(seller.getLastName());
            mailLabel.setText(seller.getMail());
            departmentNameLabel.setText(seller.getDepartmentName());

        } else {
            // Person is null, remove all the text.
            firstNameLabel.setText("");
            lastNameLabel.setText("");
            mailLabel.setText("");
            departmentNameLabel.setText("");
        }
    }

    @FXML
    public void initialize() {

        firstNameColumn.setCellValueFactory(
                new PropertyValueFactory<Seller, String>("firstName"));
        lastNameColumn.setCellValueFactory(
                new PropertyValueFactory<Seller, String>("lastName"));

        // Clear person details.
        showSellerDetails(null);

        //ObservableList<Seller> sellerData = FXCollections.observableArrayList(daoSeller.getAllSellers());
    }
}

