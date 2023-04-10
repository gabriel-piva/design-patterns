package abstract_factory;

import abstract_factory.factory.Factory;
import abstract_factory.ring.Ring;
import abstract_factory.weapon.Weapon;

// The warrior can be a human, elf, or dwarf
// Each warrior has a ring and a weapon.
public class Warrior {
    private Ring ring;
    private Weapon weapon;

    public Warrior(Factory factory) {
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

    public void forge() {
        getRing().forge();
        getWeapon().forge();
    }
}
