import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Wpisz nazwe swojej postaci");
        String name = input.nextLine();

        Hero player = new Hero(name);

        System.out.println("Nazywasz sie " + player.name);


        Ork enemyOrk = new Ork();
        Skeleton enemySkieleton = new Skeleton();

        //zapisujemy w zmiennych
        player.attack(enemyOrk); // wywolaismy metode attack na obiekcie/instancji player pochodzacej z klasy Hero
        player.attack(enemySkieleton);

        //enemyOrk.attack(player);

        System.out.println(enemyOrk.type);



    }
}




