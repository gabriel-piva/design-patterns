package abstract_factory.factory;

import abstract_factory.ring.DwarvenRing;
import abstract_factory.ring.Ring;
import abstract_factory.weapon.DwarvenWeapon;
import abstract_factory.weapon.Weapon;

public class DwarvenFactory implements Factory {
    @Override
    public Ring createRing() {
        return new DwarvenRing();
    }
    @Override
    public Weapon createWeapon() {
        return new DwarvenWeapon();
    }
}
