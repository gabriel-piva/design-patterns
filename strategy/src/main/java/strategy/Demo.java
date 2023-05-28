package strategy;

import strategy.bending.*;

public class Demo {
    public static void main(String[] args) {
        System.out.println("## Strategy:\n");

        Character aang = new Character("Aang", new AirBending());
        aang.attack();
        aang.setBending(new WaterBending());
        aang.attack();
        aang.setBending(new EarthBending());
        aang.attack();
        aang.setBending(new FireBending());
        aang.attack();

        System.out.println();
        Character katara = new Character("Katara", new WaterBending());
        katara.attack();
        Character toph = new Character("Toph", new EarthBending());
        toph.attack();
    }
}
