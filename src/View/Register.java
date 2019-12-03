package View;

import javax.swing.*;

public class Register extends JFrame
{
    private JPanel globalPanel;
    private JTextField prenomField;
    private JTextField nomField;
    private JTextField mailField;
    private JButton registerButton;
    private JPasswordField mdpField;

    public Register()
    {
        setContentPane(globalPanel);
        setTitle("Création de compte");
    }

    public void open()
    {
        pack();
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public JTextField getPrenomField()
    {
        return prenomField;
    }

    public JTextField getNomField()
    {
        return nomField;
    }

    public JTextField getMailField()
    {
        return mailField;
    }

    public JButton getRegisterButton()
    {
        return registerButton;
    }

    public JPasswordField getMdpField()
    {
        return mdpField;
    }
}
