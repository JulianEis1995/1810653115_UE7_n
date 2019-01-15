package Aufgabe_5;
public class Aufruf_Unchecked
{
        /*Unchecked Exception
        - Ist abgeleitet von der Oberklasse RuntimeException.
        - Wird während der Laufzeit geprüft.
        - Führt ohne ein try catch zu einem Programmabsturz. */

    public static void main(String[] args)
    {
        // ohne try-catch
        int e, b;
        e = 0;
        b = 42 / e;
        System.out.println(b);

        System.out.println("-------------------");

        // mit try-catch
        int d, a;
        try
        {
            d = 0;
            a = 42 / d;
            System.out.println(a);
        }
        catch (ArithmeticException ex)
        {
            System.err.println("Division durch 0 nicht möglich");
        }
    }



}
