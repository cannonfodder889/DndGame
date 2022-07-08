import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Hero player;

        Scanner input = new Scanner(System.in);

        System.out.println("Wpisz nazwe swojej postaci");
        String name = input.nextLine();
        player = new Hero(name);

        System.out.println("Nazywasz sie " + player.name);


        Ork enemyOrk;
        Skeleton enemySkieleton;

        enemyOrk = new Ork();
        enemySkieleton = new Skeleton();


        enemyOrk.takeDamage(5);
        enemySkieleton.takeDamage(1000);

        System.out.println(enemyOrk.type);



    }
}




