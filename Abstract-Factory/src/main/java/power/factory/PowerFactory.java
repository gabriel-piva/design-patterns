package power.factory;

import power.ring.Ring;
import power.weapon.Weapon;

public interface PowerFactory {
    Ring createRing();
    Weapon createWeapon();
}
