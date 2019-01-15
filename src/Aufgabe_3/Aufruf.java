package Aufgabe_3;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufruf
{
    public static void main(String[] args)
    {
        String email = JOptionPane.showInputDialog("Mail eingeben");
        try
        {
            checkEmail(email);
            JOptionPane.showMessageDialog(null, "Ihre Mail: " + email + " ist gültig!");
        }
        catch (IllegalArgumentException e)
        {
            System.err.println(e.getMessage());
        }
    }

    public static void checkEmail(String email)
    {
        Pattern pattern = Pattern.compile( "[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}" );
        Matcher m = pattern.matcher(email);

        if(!m.find())
        {
            throw new IllegalArgumentException("Wrong Mail Format");
        }
    }
}
