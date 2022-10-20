import java.util.Scanner;

public class Cwiczenia_3_Knochowski_Zad2
{
    public static void main(String[] args)
    {
        // Zadanie 2

        Scanner scannerKnochowski = new Scanner(System.in);
        float heightKnochowski, weightKnochowski, BMIKnochowski;
        System.out.printf("\nPodaj swój wzrost (metry): ");
        heightKnochowski = scannerKnochowski.nextFloat();
        System.out.printf("Podaj swoją wagę (kilogramy): ");
        weightKnochowski = scannerKnochowski.nextFloat();
        BMIKnochowski = weightKnochowski/(float)(Math.pow(heightKnochowski,2));
        if(BMIKnochowski < 16)
        {
            System.out.printf("Wygłodzenie BMI = " + BMIKnochowski);
        }
        else if(BMIKnochowski >= 16 && BMIKnochowski <= 16.99)
        {
            System.out.printf("Wychudzenie BMI = " + BMIKnochowski);
        }
        else if(BMIKnochowski >= 17 && BMIKnochowski <= 18.49)
        {
            System.out.printf("Niedowaga BMI = " + BMIKnochowski);
        }
        else if(BMIKnochowski >= 18.50 && BMIKnochowski <= 22.99)
        {
            System.out.printf("Norma niski przedział BMI = " + BMIKnochowski);
        }
        else if(BMIKnochowski >= 23 && BMIKnochowski <= 24.99)
        {
            System.out.printf("Norma wysoki przedział BMI = " + BMIKnochowski);
        }
        else if(BMIKnochowski >= 25 && BMIKnochowski <= 27.49)
        {
            System.out.printf("Nadwaga niski przedział BMI = " + BMIKnochowski);
        }
        else if(BMIKnochowski >= 27.50 && BMIKnochowski <= 29.99)
        {
            System.out.printf("Nadwaga wysoki przedział BMI = " + BMIKnochowski);
        }
        else if(BMIKnochowski >= 30 && BMIKnochowski <= 34.9)
        {
            System.out.printf("Otyłość I stopnia BMI = " + BMIKnochowski);
        }
        else if(BMIKnochowski >= 35 && BMIKnochowski <= 39.9)
        {
            System.out.printf("Otyłość II stopnia BMI = " + BMIKnochowski);
        }
        else
        {
            System.out.printf("Otyłość III stopnia BMI = " + BMIKnochowski);
        }
    }
}
