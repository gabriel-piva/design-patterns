package template_method;

import template_method.spell.Spell;

import java.util.List;
import java.util.ArrayList;

public class Wizard {
    private String name;
    private List<Spell> spells;

    public Wizard(String name) {
        this.name = name;
        this.spells = new ArrayList<>();
    }

    public void learnSpell(Spell spell) {
        spells.add(spell);
    }
    public void castSpells() {
        for (Spell spell : spells) {
            System.out.println("# " + name + " is casting a spell:");
            spell.cast();
            System.out.println();
        }
    }
}
