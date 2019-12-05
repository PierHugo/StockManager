package Controller;

import Model.Employe;
import View.MainView;


public class Controller
{
    private MainView mainView;
    private Employe employe;

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
