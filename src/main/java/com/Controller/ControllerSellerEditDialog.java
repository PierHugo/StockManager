package Controller;


import Model.Seller;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControllerSellerEditDialog {
    @FXML
    private TextField firstnameField;
    @FXML
    private TextField lastnameField;
    @FXML
    private TextField mailField;
    @FXML
    private TextField departmentField;


    private Stage dialogStage;
    private Seller seller;
    private boolean okClicked = false;
    @FXML
    private void initialize() {
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;

        firstnameField.setText(seller.getFirstName());
        lastnameField.setText(seller.getLastName());
        mailField.setText(seller.getMail());
        departmentField.setText(seller.getDepartmentName());
    }

    public boolean isOkClicked() {
        return okClicked;
    }

    @FXML
    private void handleConfirm() {
        if (isInputValid()) {
            seller.setFirstName(firstnameField.getText());
            seller.setLastName(lastnameField.getText());
            seller.setMail(mailField.getText());
            seller.setDepartmentName(departmentField.getText());

            okClicked = true;
            dialogStage.close();
        }
    }

    @FXML
    private void handleCancel() {
        dialogStage.close();
    }

    private boolean isInputValid() {
        String errorMessage = "";

        if (firstnameField.getText() == null || firstnameField.getText().length() == 0) {
            errorMessage += "No valid firstname!\n";
        }
        if (lastnameField.getText() == null || lastnameField.getText().length() == 0) {
            errorMessage += "No valid lastname!\n";
        }
        if (mailField.getText() == null || mailField.getText().length() == 0) {
            errorMessage += "No valid mail!\n";
        }

        if (departmentField.getText() == null || departmentField.getText().length() == 0) {
            errorMessage += "No valid department!\n";
        }

        if (errorMessage.length() == 0) {
            return true;
        } else {
            // Show the error message.
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.initOwner(dialogStage);
            alert.setTitle("Invalid Fields");
            alert.setHeaderText("Please correct invalid fields");
            alert.setContentText(errorMessage);

            alert.showAndWait();

            return false;
        }
    }
}
