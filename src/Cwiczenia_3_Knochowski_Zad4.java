public class Cwiczenia_3_Knochowski_Zad4
{
    public static void main(String[] args)
    {
        // Zadanie 4

        int SumaKnochowski = 0;
        for(int iKnochowski = 1; iKnochowski <= 100; iKnochowski++)
        {
            if(iKnochowski % 2 == 0)
            {
                SumaKnochowski += iKnochowski;
            }
        }
        System.out.printf("\nSuma liczb parzystych od 1 do 100 wynosi " + SumaKnochowski);
    }
}
