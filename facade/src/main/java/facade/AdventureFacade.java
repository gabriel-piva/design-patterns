package facade;

import java.util.ArrayList;
import java.util.List;
import facade.company.*;
import facade.company.Character;

public class AdventureFacade {
    private List<Character> characters;

    public AdventureFacade() {
        characters = new ArrayList<Character>();
    }

    public void addHobbit(String name) {
        characters.add(new Hobbit(name));
    }
    public void addDwarf(String name) {
        characters.add(new Dwarf(name));
    }
    public void addWizard(String name) {
        characters.add(new Wizard(name));
    }
    public void removeCharacter(Character character) {
        characters.remove(character);
    }

    public void describeCharacters() {
        for (Character character : characters) {
            character.describe();
        }
        System.out.println();
    }

    public void useAgility() {
        for (Character character : characters) {
            if (character instanceof Hobbit) {
                ((Hobbit) character).useAgility();
            }
        }
    }
    public void useAxes() {
        for (Character character : characters) {
            if (character instanceof Dwarf) {
                ((Dwarf) character).useAxe();
            }
        }
    }
    public void useSpells() {
        for (Character character : characters) {
            if (character instanceof Wizard) {
                ((Wizard) character).useSpell();
            }
        }
    }
}






