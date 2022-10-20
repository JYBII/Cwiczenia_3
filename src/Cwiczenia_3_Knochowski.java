import java.util.Scanner;

public class Cwiczenia_3_Knochowski
{
    public static void main(String[] args)
    {
        // Zadanie 1

        float FirstNumberKnochowski, SecondNumberKnochowski;
        System.out.printf("Kalkulator");
            Scanner scannerKnochowski = new Scanner(System.in);
            System.out.printf("\nPodaj pierwszą liczbę: ");
            FirstNumberKnochowski = scannerKnochowski.nextFloat();
            System.out.printf("Podaj drugą liczbę: ");
            SecondNumberKnochowski = scannerKnochowski.nextFloat();
        System.out.printf("\nSuma: %5.2f%n", (FirstNumberKnochowski+SecondNumberKnochowski));
        System.out.printf("Różnica: %5.2f%n", (FirstNumberKnochowski-SecondNumberKnochowski));
        System.out.printf("Iloczyn: %5.2f%n", (FirstNumberKnochowski*SecondNumberKnochowski));
        System.out.printf("Iloraz: %5.2f%n", (FirstNumberKnochowski/SecondNumberKnochowski));
    }
}
