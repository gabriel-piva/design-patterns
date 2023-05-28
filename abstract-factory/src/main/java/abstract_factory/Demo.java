package abstract_factory;

import abstract_factory.factory.*;

public class Demo {
    public static void main(String[] args) {
        System.out.println("## Abstract Factory:\n");

        HouseFactory starkFactory = new StarkFactory();
        Character nedStark = new Character("Ned Stark", starkFactory);
        nedStark.useEquipment();

        HouseFactory lannisterFactory = new LannisterFactory();
        Character jaimeLannister = new Character("Jaime Lannister", lannisterFactory);
        jaimeLannister.useEquipment();

        HouseFactory targaryenFactory = new TargaryenFactory();
        Character aegonTargaryen = new Character("Aegon Targaryen", targaryenFactory);
        aegonTargaryen.useEquipment();
    }
}
