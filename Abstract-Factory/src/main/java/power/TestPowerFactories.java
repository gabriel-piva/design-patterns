package power;

import power.factory.DwarvenFactory;
import power.factory.ElvenFactory;
import power.factory.HumanFactory;
import power.factory.PowerFactory;

public class TestPowerFactories {
    public static Power getRandomPower() {
        PowerFactory factory;
        int random = (int)(Math.random() * 3) + 1;
        if (random == 1) {
            factory = new HumanFactory();
        } else if (random == 2) {
            factory = new ElvenFactory();
        } else {
            factory = new DwarvenFactory();
        }
        return new Power(factory);
    }

    public static void main(String[] args) {
        Power power = getRandomPower();
        power.forgePowers();
    }
}
