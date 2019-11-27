package View;

import javax.swing.*;

public class MainView extends JFrame {
    private JPanel MainPanel;
    private JTabbedPane tabbedPane1;

    public MainView() {
        setContentPane(MainPanel);
        setTitle("Gestion de stocks");
    }

    public void open() {
        pack();
        setSize(750, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}