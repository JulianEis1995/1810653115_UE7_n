package Aufgabe_1;

public class Aufruf
{
    public static void main(String[] args)
    {
        // FOR-Schleife
        for (int i = 0; i <10; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                //TODO
            }
        }

        // WHILE-Schleife
        int i = 0;
        int j = 0;
        while (i < 10)
        {
            while (j < 5)
            {
                j++;
            }
            i++;
        }

        // TRY - CATCH- FINALLY
        try
        {
            int a = 0;
            int b = 0;
            System.out.println(a/b);
        }
        catch (ArithmeticException e)
        {
            System.err.println("Null eingegeben");
        }
        finally
        {
            System.out.println("Anweisung abgeschlossen");
        }

        System.out.println(Rekursiv(5));
    }

    //Rekursive Methode
    public static int Rekursiv(int n)
    {
        if (n == 1)
            return 1;
        else
            return Rekursiv (n - 1) + n;
    }
}