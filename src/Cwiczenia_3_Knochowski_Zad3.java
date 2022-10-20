import java.util.Scanner;

public class Cwiczenia_3_Knochowski_Zad3
{
    public static void main(String[] args)
    {
        // Zadanie 3

        Scanner scannerKnochowski = new Scanner(System.in);
        float aKnochowski, bKnochowski, cKnochowski, deltaKnochowski, x1Knochowski, x2Knochowski;
        int liczbaKnochowski;
        do {
            System.out.printf("\nPodaj wartość a: ");
            aKnochowski = scannerKnochowski.nextFloat();
        }while (aKnochowski == 0);
        System.out.printf("Podaj wartość b: ");
        bKnochowski = scannerKnochowski.nextFloat();
        System.out.printf("Podaj wartość c: ");
        cKnochowski = scannerKnochowski.nextFloat();
        deltaKnochowski = (float)(Math.pow(bKnochowski,2)) - (4 * aKnochowski * cKnochowski);
        System.out.printf("\nDelta = " + deltaKnochowski);
        if(deltaKnochowski > 0)
        {
            liczbaKnochowski = 1;
        }
        else if(deltaKnochowski == 0)
        {
            liczbaKnochowski = 0;
        }
        else
        {
            liczbaKnochowski = -1;
        }
        switch (liczbaKnochowski)
        {
            case 0:
            {
                x1Knochowski = -bKnochowski/(2*aKnochowski);
                System.out.printf("\nX = " + x1Knochowski);
                break;
            }
            case 1:
            {
                float PierwiastekDeltaKnochowski = (float)(Math.pow(deltaKnochowski, 1/2));
                x1Knochowski = (-bKnochowski - PierwiastekDeltaKnochowski) / (2 * aKnochowski);
                x2Knochowski = (-bKnochowski + PierwiastekDeltaKnochowski) / (2 * aKnochowski);
                System.out.printf("\nX1 = " + x1Knochowski + "   X2 = " + x2Knochowski);
                break;
            }
            default:
            {
                System.out.printf("\nRównanie kwadratowe niema rozwiązań");
                break;
            }
        }
    }
}
