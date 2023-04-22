package template_method;

import template_method.spell.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("## Template Method:\n");

        Wizard luna = new Wizard("Luna Lovegood");

        luna.learnSpell(new Expelliarmus());
        luna.learnSpell(new ExpectoPatronum("Hare"));

        luna.castSpells();
    }
}
