package combat;

public class Sword implements Weapon {
    @Override
    public void using() {
        System.out.println(" is using a sword");
    }
    @Override
    public void description() {
        System.out.println("It's an elven long sword called Orcrist");
    }
    @Override
    public void attack() {
        System.out.println(" attacks melee with the sword");
    }
}
