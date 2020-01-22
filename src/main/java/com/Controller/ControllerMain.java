package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControllerMain
{
    @FXML
    private Button HelloWorldButton;

    @FXML
    void printHelloWorld(ActionEvent event)
    {
        System.out.println("HelloWorld!");
    }

}
