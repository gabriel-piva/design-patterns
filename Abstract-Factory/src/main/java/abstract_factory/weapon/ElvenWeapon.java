package abstract_factory.weapon;

public class ElvenWeapon implements Weapon {
    @Override
    public void forge() {
        System.out.println("A new elven bow has been forged.");
    }
}
