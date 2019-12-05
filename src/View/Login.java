package View;

import javax.swing.*;

public class Login extends JFrame
{
    private JPanel loginPanel;
    private JTextField mailField;
    private JPasswordField mdpField;
    private JButton seConnecterButton;
    private JLabel register;

    public Login()
    {
        setContentPane(loginPanel);
        setTitle("Connexion");
        register.setText("<html><u>" + register.getText() + "</u></html>");
    }

    public void open()
    {
        pack();
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public JTextField getMailField()
    {
        return mailField;
    }

    public JPasswordField getMdpField()
    {
        return mdpField;
    }

    public JButton getSeConnecterButton()
    {
        return seConnecterButton;
    }

    public JLabel getRegister()
    {
        return register;
    }
}
