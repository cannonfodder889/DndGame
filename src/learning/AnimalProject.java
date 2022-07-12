package learning;

import learning.inheritage.Animal;
import learning.inheritage.Chickin;
import learning.inheritage.Dog;
import learning.inheritage.Cat;

import java.util.ArrayList;
import java.util.List;

public class AnimalProject {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<Animal>();

        Dog pies = new Dog();

        for (int i = 0; i <= 10; i++) {
            animals.add(new Cat());
            animals.add(new Dog());
            animals.add(new Chickin());

        }

        for (Animal a : animals) {
            a.speak();

        }

        pies.speak();

    }
}
// Stworzylismy petle for w ktorej za pomocą wartosci tworzymy w tym przypadku 11 innych obiektow ktore są inherited
//  ale rowniez za pomoca jednej zmiennej "a" wywolujemy w kazdej z tych obiektow metode .speak
// jezeli w inherited klasach jest metoda bedzie uzyta metoda danej inherited klasy
// jezeli w inherited klasach nie ma zadnej metody wtedy bedzie uzyta metoda z rodzica tj. Animals
// jezeli uzyjemy i zaznaczymy ze klasa jak i metoda jest abstract to wtedy bedzie wymagane aby w klasach inherited
// byly wpisane bezposreddnio metody poniewaz w Animals ta metoda nie istnieje - jest tylko abstrakcyjna
//  public abstract class Animals - public abstract void speak()   (jezeli metoda ma byc abstrakcyjna to klasa tez musi)
