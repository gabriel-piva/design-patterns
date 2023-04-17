package abstract_factory;

import abstract_factory.armor.Armor;
import abstract_factory.sword.Sword;
import abstract_factory.factory.HouseFactory;

public class Character {
    private String name;
    private Sword sword;
    private Armor armor;

    public Character(String name, HouseFactory factory) {
        this.name = name;
        this.sword = factory.createSword();
        this.armor = factory.createArmor();
    }
    public void useEquipment() {
        System.out.println("# " + name + " uses " + sword.getName() + " and " + armor.getName());
    }
}
