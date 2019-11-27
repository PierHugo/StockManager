package Controller;

import View.MainView;

public class Controller {
    private MainView mainView;

    public Controller()
    {
        startView();
    }

    private void startView() {
        mainView = new MainView();
        mainView.open();
    }

}
