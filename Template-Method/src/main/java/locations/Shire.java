package locations;

public class Shire extends LocationTemplate {
    public Shire(int currentPopulation) {
        super(currentPopulation);
    }

    @Override
    protected void lDescription() {
        System.out.println("The Shire is a small but beautiful and fruitful land in Eriador");
    }
    @Override
    protected void lPopulation() {
        System.out.println("An inland area settled exclusively by Hobbits, having currently " + getCurrentPopulation() + " residents");
    }
}
