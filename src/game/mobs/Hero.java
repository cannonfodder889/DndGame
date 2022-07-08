package game.mobs;

import game.Debug;

public class Hero { //tworzenie nowej instancji po inpucie zmiennej name
    private boolean isActive; //To są pola calosc sklada sie z typu i nazwy
    private String name;
    private float hitPoints = 100f;
    private float manaPoints = 100f;
    private int baseDamage = 10;
    private int strength = 2;

    void takeDamage(float damage) {
        hitPoints -= damage;
        Debug.log("Heroes teraz ma hp :" + hitPoints);
        if (hitPoints < 0) {
      //      die();

        }
    }
    public String getName() {
        return this.name;
    }

    public float getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(float hitPoints) {
        this.hitPoints = hitPoints;
    }
    public void attack(Enemy enemy){ // aby zapamietac pewna wartosc potrzebujemy zmiennych, ktore to tworzy sie tymczasowo w metodzie(funkcji)
        enemy.takeDamage(baseDamage * strength);
    }


    public Hero() {
        Debug.log("konstruktor bezparametrowy");
    }

    public Hero(String name) { // to jest konstruktor ale parametrowy - nie dodajemy void w construktorze (ani innego typu)
        Debug.log("dupa");
        this.name = name; // stworzonemu bohaterowi gracz wpisuje imie i ma przypisac wartosc mp i hp
    }

    public void setActive() {
        isActive = true;
    }

    public void setInactive() {
        isActive = false;
    }

    public void printStatus() {
        if (isActive) {
            Debug.log("game.mobs.Hero " + name + "is active");
        } else {
            Debug.log("game.mobs.Hero " + name + "is inactive");
        }
    }
}
