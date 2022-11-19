package mordor;

import java.util.ArrayList;
import java.util.List;

public class OneRing {
    private List<String> powers;
    private List<String> bearers;
    private static final OneRing oneRing = new OneRing();

    // Singleton
    private OneRing() {
        powers = new ArrayList<>();
        bearers = new ArrayList<>();
    }
    public static OneRing getOneRing() {
        return oneRing;
    }

    // Getters
    public List<String> getPowers() {
        return powers;
    }
    public List<String> getBearers() {
        return bearers;
    }

    // Methods
    public void addPower(String power) {
        this.powers.add(power);
    }
    public void addBearer(String bearer) {
        this.bearers.add(bearer);
    }
}
