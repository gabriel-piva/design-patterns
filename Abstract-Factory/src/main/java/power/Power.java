package power;

import power.factory.PowerFactory;
import power.ring.Ring;
import power.weapon.Weapon;

public class Power {
    private Ring ring;
    private Weapon weapon;

    public Power(PowerFactory factory) {
        setRing(factory.createRing());
        setWeapon(factory.createWeapon());
    }

    public Ring getRing() {
        return ring;
    }
    public void setRing(Ring ring) {
        this.ring = ring;
    }

    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void forgePowers() {
        getRing().forge();
        getWeapon().forge();
    }
}
