package locations;

public abstract class LocationTemplate {
    private int currentPopulation;

    public LocationTemplate(int currentPopulation) {
        this.currentPopulation = currentPopulation;
    }

    public int getCurrentPopulation() {
        return currentPopulation;
    }
    public void setCurrentPopulation(int currentPopulation) {
        this.currentPopulation = currentPopulation;
    }

    protected abstract void lDescription();
    protected abstract void lPopulation();

    public void describeLocation() {
        lDescription();
        lPopulation();
    }
}
