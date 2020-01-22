package Main;

import DB.Dataset;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main extends Application
{

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

        /* Application */
        try
        {
            launch(args);
        } catch (Exception e)
        {
            System.out.println("Erreur lors de l'utilisation de l'application :\n-> " + e);
        }

    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("/View/ViewMain.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
