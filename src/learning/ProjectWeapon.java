package learning;

import learning.weaponType.Weapon;

public class ProjectWeapon {
    public static void main(String[] args) {

        Weapon testweapon = new Weapon(true, "test", 1, "piercing", 2);

        Weapon ak = new Weapon(true, "ak", 1, "piercing", 500);
        Weapon knife = new Weapon(true, "knife", 1, "piercing", 1);
        Weapon m4a1 = new Weapon(true, "m4a1", 1, "piercing", 500);
        Weapon m16 = new Weapon(true, "m16", 1, "piercing", 500);
        Weapon bow = new Weapon(true, "bow", 1, "piercing", 15);
        Weapon mine = new Weapon(true, "mine", 1, "piercing", 1);


        /*ak.setName("parufa");             seterowa metoda juz nie uzywana (uzylismy metody z poziomu konstruktora)
        knife.setName("knife");
        m4a1.setName("m4a1");
        m16.setName("m16");
        bow.setName("bow");
        mine.setName("mine");*/

        ak.displayInfo();
        m4a1.displayInfo();
        m16.displayInfo();
        bow.displayInfo();
        mine.displayInfo();

        ak.attack(500);
        m4a1.attack(500);
        m16.attack(500);
        bow.attack(15);
        mine.attack(1);


    }
}
