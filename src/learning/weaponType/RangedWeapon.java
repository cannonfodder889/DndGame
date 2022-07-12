package learning.weaponType;

public class RangedWeapon extends WeaponWithInheritance {

    private int range;

    public RangedWeapon(String name, float damage, String damageType) {
        super(name, damage, damageType);
    }

    // z @ to są adnotacje tkz. metadane - opisuja klase - override metoda przeciazona nadpisana
    // @ depricated - oznacza zze tej metody wkrotce nie bdzie uzywac - tj. prosze jej juz nie uzywac

    @Override
    public void attack(String enemy) {
        if (enemy.equals("close")){
            System.out.println("Damage: " + this.damage);

        }

    }
}
