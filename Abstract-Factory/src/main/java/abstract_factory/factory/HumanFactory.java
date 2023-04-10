package abstract_factory.factory;

import abstract_factory.ring.HumanRing;
import abstract_factory.ring.Ring;
import abstract_factory.weapon.HumanWeapon;
import abstract_factory.weapon.Weapon;

public class HumanFactory implements Factory {
    @Override
    public Ring createRing() {
        return new HumanRing();
    }
    @Override
    public Weapon createWeapon() {
        return new HumanWeapon();
    }
}
