package game.mobs;

import game.Debug;

public class Enemy {
    private float hitPoints = 100f;

    void die(){
        Debug.log("enemy is dead: " + this);
    }

    /*
    * Definicja metody:
    * Metoda sklada sie z:
    * 1. Modyfikatora dostepu (brak / private / protected / public
    * 2. Zwracanego typu - np: String, void, int itd.
    * 3. Nazwy - np takeDamage
    * 4. Opcjonalnych parametrow w nawiasie rozdzielanych przecinkami skladajacy sie z:
    *   - typ
    *   - nazwa
    *  */
    void takeDamage(int damage) {
        hitPoints = hitPoints - damage;
        Debug.log("teraz mam zytka:" + hitPoints);
        if (hitPoints < 0) {
            die();
        }
    }




    public Enemy(){
        Debug.log("game.mobs.Enemy created: " + this);
    }

    public void attack(Hero dupa) {
        dupa.takeDamage((float) 5);
    }
}

