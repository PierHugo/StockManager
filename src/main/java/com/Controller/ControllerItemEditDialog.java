package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import Model.Item;

public class ControllerItemEditDialog {

        @FXML
        private TextField nameField;
        @FXML
        private TextField priceField;
        @FXML
        private TextField quantityField;
        @FXML
        private TextField referenceField;


        private Stage dialogStage;
        private Item item;
        private boolean okClicked = false;
        @FXML
        private void initialize() {
        }

        public void setDialogStage(Stage dialogStage) {
            this.dialogStage = dialogStage;
        }

        public void setItem(Item item) {
            this.item = item;

            nameField.setText(item.getName());
            priceField.setText(Double.toString(item.getPrice()));
            quantityField.setText(Integer.toString(item.getQuantity()));
            referenceField.setText(item.getReference());
        }

        public boolean isOkClicked() {
            return okClicked;
        }

        @FXML
        private void handleConfirm() {
            if (isInputValid()) {
                item.setName(nameField.getText());
                item.setPrice(Double.parseDouble(priceField.getText()));
                item.setQuantity(Integer.parseInt(quantityField.getText()));
                item.setReference(referenceField.getText());

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

            if (nameField.getText() == null || nameField.getText().length() == 0) {
                errorMessage += "No valid name!\n";
            }
            if (priceField.getText() == null || priceField.getText().length() == 0) {
                errorMessage += "No valid price!\n";
            }
            if (quantityField.getText() == null || quantityField.getText().length() == 0) {
                errorMessage += "No valid quantity!\n";
            }

            if (referenceField.getText() == null || referenceField.getText().length() == 0) {
                errorMessage += "No valid reference!\n";
            }

            if (errorMessage.length() == 0) {
                return true;
            } else {
                // Show the error message.
                Alert alert = new Alert(AlertType.ERROR);
                alert.initOwner(dialogStage);
                alert.setTitle("Invalid Fields");
                alert.setHeaderText("Please correct invalid fields");
                alert.setContentText(errorMessage);

                alert.showAndWait();

                return false;
            }
        }
}

