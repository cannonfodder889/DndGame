public class ManageLightBulbs {
    public void doStuff() {
        System.out.println(LightBulb.BULBS_COUNT);

        LightBulb zarufka;
        LightBulb zarufka2;
        LightBulb zarufka3;
        zarufka = new LightBulb("red");
        zarufka2 = new LightBulb("blue");
        zarufka3 = new LightBulb();



        System.out.println(LightBulb.BULBS_COUNT);

        zarufka.turnOn(); // kropka - operator dostepu do tej metody
        zarufka2.turnOn(); // pokasz kotku co masz w srodku :)
        zarufka3.turnOn();
        zarufka2.turnOff();

        zarufka.display();
        zarufka2.display();
        zarufka3.display();
    }
}
