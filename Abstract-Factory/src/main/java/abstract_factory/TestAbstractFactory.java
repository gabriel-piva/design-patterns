package abstract_factory;

import abstract_factory.factory.DwarvenFactory;
import abstract_factory.factory.ElvenFactory;
import abstract_factory.factory.HumanFactory;
import abstract_factory.factory.Factory;

public class TestAbstractFactory {
    public static Warrior getRandomWarrior() {
        Factory factory;
        int random = (int)(Math.random() * 3) + 1;
        factory = switch (random) {
            case 1 -> new HumanFactory();
            case 2 -> new ElvenFactory();
            default -> new DwarvenFactory();
        };
        return new Warrior(factory);
    }

    public static void main(String[] args) {
        Warrior warrior = getRandomWarrior();
        warrior.forge();
    }
}
