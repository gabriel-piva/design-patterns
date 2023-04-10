package abstract_factory.ring;

public class ElvenRing implements Ring {
    @Override
    public void forge() {
        System.out.println("A new elven ring has been forged.");
    }
}
