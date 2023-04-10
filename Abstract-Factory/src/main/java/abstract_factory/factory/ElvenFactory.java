package abstract_factory.factory;

import abstract_factory.ring.ElvenRing;
import abstract_factory.ring.Ring;
import abstract_factory.weapon.ElvenWeapon;
import abstract_factory.weapon.Weapon;

public class ElvenFactory implements Factory {
    @Override
    public Ring createRing() {
        return new ElvenRing();
    }
    @Override
    public Weapon createWeapon() {
        return new ElvenWeapon();
    }
}
