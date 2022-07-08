public class Hero { //tworzenie nowej instancji po inpucie zmiennej name
    boolean isActive; //To są pola calosc sklada sie z typu i nazwy
    String name;
    short hitPoints = 100;
    short manaPoints = 100;


    public Hero() {
        System.out.println("konstruktor bezparametrowy");
    }

    public Hero(String name) { // to jest konstruktor ale parametrowy - nie dodajemy void w construktorze (ani innego typu)
        System.out.println("dupa");
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
            System.out.println("Hero " + name + "is active");
        } else {
            System.out.println("Hero " + name + "is inactive");
        }
    }
}
