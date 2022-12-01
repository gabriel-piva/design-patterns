package power.factory;

import power.ring.DwarvenRing;
import power.ring.Ring;
import power.weapon.DwarvenWeapon;
import power.weapon.Weapon;

public class DwarvenFactory implements PowerFactory {
    @Override
    public Ring createRing() {
        return new DwarvenRing();
    }
    @Override
    public Weapon createWeapon() {
        return new DwarvenWeapon();
    }
}
