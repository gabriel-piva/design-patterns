package facade.company;

public class Wizard extends Character {
    public Wizard(String name) {
        super(name);
        type = "Wizard";
    }

    public void useSpell() {
        System.out.println("# " + name + " casts a powerful spell");
    }
}
