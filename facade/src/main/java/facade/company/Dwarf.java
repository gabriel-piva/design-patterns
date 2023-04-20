package facade.company;

public class Dwarf extends Character {
    public Dwarf(String name) {
        super(name);
        type = "Dwarf";
    }

    public void useAxe() {
        System.out.println("# " + name + " uses their axe to chop through obstacles");
    }
}