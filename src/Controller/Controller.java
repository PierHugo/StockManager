package Controller;

import Model.Employe;
import Model.Utils;
import View.Login;
import View.MainView;
import View.Register;
import com.Notification;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;


public class Controller
{
    private MainView mainView;
    private Employe employe;
    private Login login;

    public Controller()
    {
        Utils.connection();
        opening();
    }

    private void opening()
    {
        login = new Login();
        login.getMailField().setText(Utils.getLastMail());

        login.getRegister().addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseReleased(MouseEvent e)
            {
                actionRegister();
                login.dispose();
            }
        });

        login.getMdpField().addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent e)
            {
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    try
                    {
                        logIn();
                    } catch (IOException e1)
                    {
                        new Notification(login, "Erreur", e1.getMessage());
                    }
                }
            }
        });

        login.getSeConnecterButton().addActionListener(e ->
        {
            try
            {
                logIn();
            } catch (IOException e1)
            {
                new Notification(login, "Erreur", e1.getMessage());
            }
        });

        login.open();
        if (!login.getMailField().getText().equals(""))
            login.getMdpField().requestFocusInWindow();
    }

    private void logIn() throws IOException
    {
        String mail = login.getMailField().getText();
        String mdp = Utils.hashPassword(Arrays.toString(login.getMdpField().getPassword()));
        employe = Utils.connectUser(mail, mdp);
        if (employe == null)
            throw new IOException("Le nom d'utilisateur ou mot de passe invalide");
        else
        {
            try
            {
                Utils.getProperties().setProperty("lastMail", mail);
                Utils.getProperties().storeToXML(new FileOutputStream("properties.xml"), "Sauvegarde");
            } catch (IOException e)
            {
                e.printStackTrace();
            }
            login();
            login.dispose();
        }
    }

    private void actionRegister()
    {
        Register register = new Register();
        register.getRegisterButton().addActionListener(e ->
        {
            try
            {
                register(register);
            } catch (IOException e1)
            {
                new Notification(register, "Erreur", e1.getMessage());
            }
        });
        register.getMdpField().addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent e)
            {
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    try
                    {
                        register(register);
                    } catch (IOException e1)
                    {
                        new Notification(register, "Erreur", e1.getMessage());
                    }
                }
            }
        });

        register.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                login.setVisible(true);
            }
        });
        register.open();
    }

    private void register(Register register) throws IOException
    {
        String prenom = register.getPrenomField().getText();
        String nom = register.getNomField().getText();
        String mail = register.getMailField().getText();
        String motDePasse = Utils.hashPassword(Arrays.toString(register.getMdpField().getPassword()));
        employe = new Employe(prenom, nom, mail);
        try
        {
            assert motDePasse != null;
            if (!prenom.equals("") && !nom.equals("") && !mail.equals("") && !motDePasse.equals(""))
            {
                Utils.registerUser(employe.getNom(), employe.getPrenom(), employe.getMail(), employe.getMotDePasse());
                try
                {
                    Utils.getProperties().setProperty("lastMail", mail);
                    Utils.getProperties().storeToXML(new FileOutputStream("properties.xml"), "Sauvegarde");
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
                register.dispose();
                login();
            } else
            {
                if (prenom.equals(""))
                    register.getPrenomField().setBorder(BorderFactory.createLineBorder(Color.red));
                else
                    register.getPrenomField().setBorder(BorderFactory.createLineBorder(Color.lightGray));
                if (nom.equals(""))
                    register.getNomField().setBorder(BorderFactory.createLineBorder(Color.red));
                else
                    register.getNomField().setBorder(BorderFactory.createLineBorder(Color.lightGray));
                if (mail.equals(""))
                    register.getMailField().setBorder(BorderFactory.createLineBorder(Color.red));
                else
                    register.getMailField().setBorder(BorderFactory.createLineBorder(Color.lightGray));
                if (motDePasse.equals("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855")) // Mot de passe vide
                    register.getMdpField().setBorder(BorderFactory.createLineBorder(Color.red));
                else
                    register.getMdpField().setBorder(BorderFactory.createLineBorder(Color.lightGray));
                throw new IOException("Les champs ne peuvent pas être vide");
            }
        } catch (SQLException e1)
        {
            new Notification(register, "Erreur", "L'email est déjà utilisé par un autre utilisateur");
        }
    }

    private void login()
    {
        mainView = new MainView();
        mainView.open();
    }


}
