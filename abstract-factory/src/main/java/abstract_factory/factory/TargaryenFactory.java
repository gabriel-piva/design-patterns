package abstract_factory.factory;

import abstract_factory.armor.*;
import abstract_factory.sword.*;

public class TargaryenFactory implements HouseFactory {
    @Override
    public Sword createSword() {
        return new TargaryenSword();
    }
    @Override
    public Armor createArmor() {
        return new TargaryenArmor();
    }
}
