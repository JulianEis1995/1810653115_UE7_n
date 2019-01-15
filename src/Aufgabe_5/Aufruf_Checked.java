package Aufgabe_5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Aufruf_Checked
{
    /* Checked Exception
    - Ist abgeleitet von der Oberklasse Exception.
    - Wird beim kompilieren des Programms geprüft.
    - Muss mit einem try catch abgefangen werden. */

    public static void main(String[] args)
    {
        // ohne try-catch
        FileInputStream fis1 = null;
        fis1 = new FileInputStream("C:dasgibsned.txt");

        // mit try-catch
        try {
            FileInputStream fis2 = null;
            fis2 = new FileInputStream("C:dasgibsned.txt");
        }
        catch (FileNotFoundException e)
        {
            System.err.println("File ned daaa!");
        }
    }
}