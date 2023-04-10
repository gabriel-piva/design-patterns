package abstract_factory.factory;

import abstract_factory.ring.Ring;
import abstract_factory.weapon.Weapon;

public interface Factory {
    Ring createRing();
    Weapon createWeapon();
}
