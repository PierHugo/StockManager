package Main;

import DB.Dataset;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.io.IOException;

public class Main extends Application
{
    private Stage primaryStage;
    private BorderPane viewMain;
    

    public static void main(String[] args)
    {
        /*Database*/
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
        EntityManager em = entityManagerFactory.createEntityManager();
        try
        {
            Dataset.createDatas(em);
        } catch (Exception e)
        {
            System.out.println("Erreur lors de la création de la base de données ou des données :\n-> " + e);
        }
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) 
    {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Stock Manager");

        initViewMain();

        showConnectionView();
    }



    public void initViewMain() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/View/ViewMain.fxml"));
            viewMain = (BorderPane) loader.load();

            Scene scene = new Scene(viewMain);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showConnectionView() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/View/ConnectionView.fxml"));
            AnchorPane connectionView = (AnchorPane) loader.load();

            viewMain.setCenter(connectionView);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }
}
