package learning.weaponType;

public abstract class WeaponWithInheritance {

    protected String name;
    protected float damage;
    protected String damageType;
    protected String enemy;


    /*public Weapon(){
        System.out.println("Wywolujemy bezparametrowy konstruktor");
    }*/

    public WeaponWithInheritance(String name, float damage, String damageType){
        System.out.println("Wywolujemy parametrowy konstruktor");
        this.name = name;
        this.damage = damage;
        this.damageType = damageType;
    }




   /* public void setName(String name) {                    seterowa metoda
        this.name = name;
    }*/
  /*  public String getName() {                             nieuzywane gety
        return this.name;
    }

    public void setDamage(float damage){
    }*/
    public abstract void attack(String enemy);

    public void displayInfo(){
        System.out.println(" Bron: " + name + " Bron palna: " + " Obrazenia: " + damage + " Typ obrazen: " + damageType);
    }
}
