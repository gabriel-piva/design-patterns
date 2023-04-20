package adapter.weapon;

import lib.Blaster;

public class BlasterAdapter extends Blaster implements Weapon {
    @Override
    public String attack() {
        return this.shoot();
    }
}
