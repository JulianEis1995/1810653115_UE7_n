package Aufgabe_4;

import javax.swing.*;

public class Aufruf
{
    public static void main(String[] args)
    {
        try
        {
            String a = JOptionPane.showInputDialog("Bitte nicht dasisteintest eingeben!");

            if (a.equals("dasisteintest"))
            {
                throw new meineException();
            }

            System.out.println(a);
        }
        catch (meineException e)
        {
            System.err.println(e.toString());
        }
    }

}