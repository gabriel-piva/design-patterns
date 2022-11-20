package army;

public class TestArmy {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.addDwarf("Gimli");
        facade.addDwarf("Durin");
        facade.addElf("Legolas");
        facade.addElf("Galadriel");
        facade.addWizard("Gandalf");
        facade.addWizard("Radagast");

        facade.showArmy();
    }
}
