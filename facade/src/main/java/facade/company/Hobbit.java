package facade.company;

public class Hobbit extends Character {
    public Hobbit(String name) {
        super(name);
        type = "Hobbit";
    }

    public void useAgility() {
        System.out.println("# " + name + " uses their agility and size to infiltrate or go unnoticed");
    }
}
