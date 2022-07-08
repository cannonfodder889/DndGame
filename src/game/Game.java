package game;

import game.mobs.Hero;
import game.mobs.Ork;
import game.mobs.Skeleton;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Debug.isDebugMode = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Wpisz nazwe swojej postaci");
        String name = input.nextLine();

        Hero player = new Hero(name);

        Debug.log("Nazywasz sie " + player.getName());
        
        Ork enemyOrk = new Ork();
        Skeleton enemySkieleton = new Skeleton();

        //zapisujemy w zmiennych
        player.attack(enemyOrk); // wywolalismy metode attack() na obiekcie/instancji player pochodzacej z klasy game.mobs.Hero
        player.attack(enemySkieleton);

        enemyOrk.attack(player);

//        Debug.log(enemyOrk.type);


    }
}




