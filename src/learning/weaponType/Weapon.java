package learning.weaponType;

public class Weapon {

    private boolean isRanged;
    private String name;
    private float damage;
    private String damageType;

    private int distance;

    /*public Weapon(){
        System.out.println("Wywolujemy bezparametrowy konstruktor");
    }*/

    public Weapon(boolean isRanged, String name, float damage, String damageType, int distance ){
        System.out.println("Wywolujemy parametrowy konstruktor");
        this.isRanged = isRanged;
        this.name = name;
        this.damage = damage;
        this.damageType = damageType;
        this.distance = distance;
    }

    void setRanged() {isRanged = true; }
    void setMelee() {isRanged = false; }


   /* public void setName(String name) {                    seterowa metoda
        this.name = name;
    }*/
  /*  public String getName() {                             nieuzywane gety
        return this.name;
    }

    public void setDamage(float damage){
    }*/
    public void attack(int distance){
        this.distance = distance;

        if(distance >= 5) {
            System.out.println("bron " + name + " hit= " + damage + " obrazen");

        } else {
            System.out.println("bron " + name + " no hit cause too low distance " + damage + " obrazen");
        }

    }
    public void setDamageType(String damageType){

    }
    public void displayInfo(){
        System.out.println(" Bron: " + name + " Bron palna: " + isRanged + " Obrazenia: " + damage + " Typ obrazen: " + damageType + " distance " + distance);
    }
}
