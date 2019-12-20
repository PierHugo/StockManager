package Controller;

import Model.Vendeur;
import View.MainView;


public class Controller
{
    private MainView mainView;
    private Vendeur vendeur;

    public Controller()
    {
        opening();
    }

    private void opening()
    {
        mainView = new MainView();
        mainView.open();
    }

}
