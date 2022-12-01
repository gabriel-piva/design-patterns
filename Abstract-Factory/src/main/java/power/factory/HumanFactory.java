package power.factory;

import power.ring.HumanRing;
import power.ring.Ring;
import power.weapon.HumanWeapon;
import power.weapon.Weapon;

public class HumanFactory implements PowerFactory {
    @Override
    public Ring createRing() {
        return new HumanRing();
    }
    @Override
    public Weapon createWeapon() {
        return new HumanWeapon();
    }
}
