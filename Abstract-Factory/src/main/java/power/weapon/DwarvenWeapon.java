package power.weapon;

public class DwarvenWeapon implements Weapon {
    @Override
    public void forge() {
        System.out.println("A new dwarven axe has been forged.");
    }
}
