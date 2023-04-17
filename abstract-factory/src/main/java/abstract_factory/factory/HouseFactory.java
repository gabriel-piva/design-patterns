package abstract_factory.factory;

import abstract_factory.armor.Armor;
import abstract_factory.sword.Sword;

public interface HouseFactory {
    Sword createSword();
    Armor createArmor();
}
