package locations;

public class Gondor extends LocationTemplate {
    public Gondor(int currentPopulation) {
        super(currentPopulation);
    }

    @Override
    public void lDescription() {
        System.out.println("Gondor, the land of stone, is the greatest realm of Men in the west of Middle-earth");
    }
    @Override
    protected void lPopulation() {
        System.out.println("It's a Men kingdom with many cities, currently having " + getCurrentPopulation() + " residents");
    }
}
