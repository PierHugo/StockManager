package Model;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.Properties;

public abstract class Utils
{
    private static Connection connection;
    private static Properties properties;
    private static String lastMail;

    /**
     * registers a new user in the database
     *
     * @param nom    the name of the user
     * @param prenom the firstname of the user
     */
    public static void registerUser(String nom, String prenom, String mail, String password) throws SQLException
    {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO utilisateur(mail_user, nom_user, prenom_user, password) value (?,?,?,?)");
        preparedStatement.setString(1, mail);
        preparedStatement.setString(2, nom);
        preparedStatement.setString(3, prenom);
        preparedStatement.setString(4, password);

        preparedStatement.executeUpdate();

        preparedStatement.close();
    }

    public static Employe connectUser(String mail, String password)
    {
        Employe user = null;
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM utilisateur WHERE mail_user = ? and password = ?");
            preparedStatement.setString(1, mail);
            preparedStatement.setString(2, password);
            ResultSet set = preparedStatement.executeQuery();

            while (set.next())
                user = new Employe(set.getString(2), set.getString(3), set.getString(1));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return user;
    }

    /**
     * chiffre le mot de passe utilisateur
     *
     * @param password le mot de pass à chiffrer
     * @return le mot de pass chiffré
     */
    public static String hashPassword(String password)
    {
        try
        {
            MessageDigest md = MessageDigest.getInstance("sha-256");
            md.update(password.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte aByte : bytes)
            {
                sb.append(Integer.toString((aByte & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public static void connection()
    {
        try
        {
            properties = new Properties();
            properties.loadFromXML(new FileInputStream("properties.xml"));

            String DB_URL = properties.get("bdd_url").toString();
            String PASS = properties.get("password").toString();
            String USER = properties.get("user").toString();
            lastMail = properties.get("lastMail").toString();

            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (IOException | SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static String getPassword(String mail) throws IOException
    {
        String password = null;
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement("select password from utilisateur where mail_user = ?");
            preparedStatement.setString(1, mail);

            ResultSet set = preparedStatement.executeQuery();

            while (set.next())
                password = set.getString(1);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        if (password == null)
            throw new IOException("Aucun compte utilisateur n'est relié à ce mail");
        return password;
    }

    public static String getLastMail()
    {
        return lastMail;
    }

    public static Properties getProperties()
    {
        return properties;
    }
}
