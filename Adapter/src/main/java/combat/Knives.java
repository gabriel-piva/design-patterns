package combat;

public class Knives implements Weapon {
    @Override
    public void using() {
        System.out.println(" is using a dual knives");
    }
    @Override
    public void description() {
        System.out.println("It's a dual elven fighting knives, for an agile combat");
    }
    @Override
    public void attack() {
        System.out.println(" attacks melee with the knives");
    }
}
