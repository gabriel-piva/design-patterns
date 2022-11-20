package army;

public class Facade {
    private Army army;
    private Character character;

    public Facade() {
        army = new Army();
    }

    public void addDwarf(String name) {
        character = new Dwarf(name);
        army.addCharacter(character);
    }
    public void addWizard(String name) {
        character = new Wizard(name);
        army.addCharacter(character);
    }
    public void addElf(String name) {
        character = new Elf(name);
        army.addCharacter(character);
    }
    public void showArmy() {
        army.showCharacters();
    }
}
