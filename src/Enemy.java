public class Enemy {
    int hitPoints = 100;

    void die(){
        System.out.println("enemy is dead: " + this);
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
        System.out.println("teraz mam zytka:" + hitPoints);
        if (hitPoints < 0) {
            die();
        }
    }




    public Enemy(){
        System.out.println("Enemy created: " + this);
    }

}

