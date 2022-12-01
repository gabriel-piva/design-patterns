package power.weapon;

public class HumanWeapon implements Weapon {
    @Override
    public void forge() {
        System.out.println("A new human sword has been forged.");
    }
}
