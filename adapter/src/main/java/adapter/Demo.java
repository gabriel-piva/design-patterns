package adapter;

import adapter.weapon.*;

public class Demo {
    public static void main(String[] args) {
        System.out.println("## Adapter:\n");

        Jedi obiWan = new Jedi("Obi-Wan");

        obiWan.setWeapon(new Lightsaber());
        obiWan.combat();

        obiWan.setWeapon(new DoubleLightsaber());
        obiWan.combat();

        obiWan.setWeapon(new BlasterAdapter());
        obiWan.combat();
    }
}