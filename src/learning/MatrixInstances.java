package learning;

import java.util.Scanner;

public class MatrixInstances {
    public static void main(String[] args) {


        ManageLightBulbs m = new ManageLightBulbs();
        m.doStuff();



        Scanner sc = new Scanner(System.in);

        System.out.println("Wpisz pierwsza liczbe");
        int x = sc.nextInt();

        System.out.println("Wpisz druga liczbe");
        int y = sc.nextInt();

        System.out.println("Liczby to " + x + " i " + y);

        System.out.println("Wpisz numer odpowiadajacy operacji \n 1 - dodawanie \n 2 - odejmowanie \n 3 - mnozenie \n 4 - dzielenie");
        int operation = sc.nextInt();

        if (operation == 1) {
            System.out.println(x + y);
        }
        if (operation == 2) {
            System.out.println(x - y);
        }
        if (operation == 3) {
            System.out.println(x * y);
        }
        if (operation == 4) {
            System.out.println(x / y); //nie dziala bo x i y to nie float
        }

        System.out.println("dowidzenia");


    }


    public static int dodaj(int a, int b) {
        int wynik = a + b;
        return wynik;
    }
}
