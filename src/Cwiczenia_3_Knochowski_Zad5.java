import java.util.Random;

public class Cwiczenia_3_Knochowski_Zad5
{
    public static void main(String[] args)
    {
        // Zadanie 5

        Random randomKnochowski = new Random();
        int LosowaLiczbaKnochowski;
        int i10Knochowski = 1;
        int NajmniejszaKnochowski = 101;
        int NajwiększaKnochowski = 0;
        while (i10Knochowski != 11)
        {
            LosowaLiczbaKnochowski = randomKnochowski.nextInt(1, 100);
            System.out.printf("\nLiczba " + i10Knochowski + " = " + LosowaLiczbaKnochowski);
            if (NajwiększaKnochowski < LosowaLiczbaKnochowski)
            {
                NajwiększaKnochowski = LosowaLiczbaKnochowski;
            }
            if (NajmniejszaKnochowski > LosowaLiczbaKnochowski)
            {
                NajmniejszaKnochowski = LosowaLiczbaKnochowski;
            }
            i10Knochowski++;
        }
        System.out.printf("\n");
        System.out.printf("\nNajmniejsza liczba = " + NajmniejszaKnochowski + " , Największa liczba = "
                + NajwiększaKnochowski);
    }
}
