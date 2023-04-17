package abstract_factory.factory;

import abstract_factory.armor.*;
import abstract_factory.sword.*;

public class LannisterFactory implements HouseFactory {
    @Override
    public Sword createSword() {
        return new LannisterSword();
    }
    @Override
    public Armor createArmor() {
        return new LannisterArmor();
    }
}
