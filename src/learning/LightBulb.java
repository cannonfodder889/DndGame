package learning;

// Wszystkie klasy ktore tworzysz są tak zwanymi matrycami skladaja się na Data czyli wlasciwosci o behaviour czyli metody piszemy w postaci czasownikow
public class LightBulb {
    static int BULBS_COUNT = 0; //zmienna statyczna - dodaje poto aby zostalo w klasie(opisie)


    //------------------------------------------------------------


    int id; // dlaczego stworzylismy bulbs count zamiast id przypisac 0 i ++
    boolean state; // bolean to pole (rzeczownik a dojemy przymiotniki np isStatus)
    String colour = "white";



     public LightBulb() { //dlaczego deklarujemy metode lightbulb
         BULBS_COUNT++;
         this.id = BULBS_COUNT;

         System.out.println("learning.LightBulb " + this.id + " created");
     }

     public LightBulb(String colour) {
         BULBS_COUNT++;
         this.id = BULBS_COUNT;
         this.colour = colour;

         System.out.println("learning.LightBulb " + this.id + " created with colour " + colour);
     }

    public void turnOn() {
        state = true;
    }

    public void turnOff() {
        state = false;
    }

    public void display() {
        if (state) {
            System.out.println("learning.LightBulb " + id + " is on and shining bright " + colour);
        } else {
            System.out.println("learning.LightBulb " + id + " is off");
        }
    }
}
