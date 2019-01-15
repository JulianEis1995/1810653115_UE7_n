package Aufgabe_2;

import javax.swing.*;
import java.util.Scanner;

public class Aufruf
{
    public static void main(String[] args)
    {
        boolean valid;
        do {

                try
                {
                    String a = JOptionPane.showInputDialog("Eingeben");
                    Scanner scanner = new Scanner (a);
                    scanner.nextInt();
                    valid = true;
                }
                catch (Exception e)
                {
                    System.err.println("Invalid Integer");
                    valid = false;
                }
            } while (!valid);
    }
}

