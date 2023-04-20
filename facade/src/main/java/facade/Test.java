package facade;

public class Test {
    public static void main(String[] args) {
        System.out.println("## Facade:\n");

        AdventureFacade adventureFacade = new AdventureFacade();

        adventureFacade.addDwarf("Thorin");
        adventureFacade.addHobbit("Bilbo");
        adventureFacade.addWizard("Gandalf");

        adventureFacade.describeCharacters();

        adventureFacade.useAxes();
        adventureFacade.useAgility();
        adventureFacade.useSpells();
    }
}
