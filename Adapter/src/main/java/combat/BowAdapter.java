package combat;

import weapon.Bow;

public class BowAdapter extends Bow implements Weapon {
    @Override
    public void using() {
        this.equip();
    }
    @Override
    public void description() {
        this.details();
    }
    @Override
    public void attack() {
        this.shoot();
    }
}
