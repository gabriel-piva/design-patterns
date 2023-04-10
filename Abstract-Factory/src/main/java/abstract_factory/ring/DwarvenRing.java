package abstract_factory.ring;

public class DwarvenRing implements Ring {
    @Override
    public void forge() {
        System.out.println("A new dwarven ring has been forged.");
    }
}
