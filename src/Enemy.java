public class Enemy {
    int hitPoints = 100;

    void die(){
        System.out.println("enemy is dead: " + this);
    }

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

