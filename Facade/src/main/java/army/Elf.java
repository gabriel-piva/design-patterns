package army;

public class Elf extends Character {
    public Elf(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.print("The elf ");
        super.attack();
        System.out.println("a wooden bow");
    }
}
