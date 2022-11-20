package army;

public class Dwarf extends Character {
    public Dwarf(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.print("The dwarf ");
        super.attack();
        System.out.println("a steel axe");
    }
}
