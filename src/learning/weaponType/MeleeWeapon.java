package learning.weaponType;
// przy inheritance uzywa sie super do wywolania konstruktora classy rodzica

public class MeleeWeapon extends WeaponWithInheritance {

    public MeleeWeapon(String name, float damage, String damageType) {
        super(name, damage, damageType);
    }

    @Override
    public void attack(String enemy) {
        System.out.println("Damage: " + this.damage);

    }
}
