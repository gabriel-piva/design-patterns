package power.factory;

import power.ring.ElvenRing;
import power.ring.Ring;
import power.weapon.ElvenWeapon;
import power.weapon.Weapon;

public class ElvenFactory implements PowerFactory {
    @Override
    public Ring createRing() {
        return new ElvenRing();
    }
    @Override
    public Weapon createWeapon() {
        return new ElvenWeapon();
    }
}
