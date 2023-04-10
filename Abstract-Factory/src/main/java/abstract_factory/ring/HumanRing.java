package abstract_factory.ring;

public class HumanRing implements Ring {
    @Override
    public void forge() {
        System.out.println("A new human ring has been forged.");
    }
}
