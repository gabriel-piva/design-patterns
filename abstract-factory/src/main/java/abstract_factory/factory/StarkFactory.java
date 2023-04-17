package abstract_factory.factory;

import abstract_factory.armor.*;
import abstract_factory.sword.*;

public class StarkFactory implements HouseFactory {
    @Override
    public Sword createSword() {
        return new StarkSword();
    }
    @Override
    public Armor createArmor() {
        return new StarkArmor();
    }
}
