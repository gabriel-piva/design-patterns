package locations;

public class Rivendell extends LocationTemplate {
    public Rivendell(int currentPopulation) {
        super(currentPopulation);
    }

    @Override
    public void lDescription() {
        System.out.println("Rivendell is a deep valley in the east of Eriador, near the Misty Mountains");
    }
    @Override
    public void lPopulation() {
        System.out.println("It's an Elf refuge with currently " + getCurrentPopulation() + " residents");
    }
}
