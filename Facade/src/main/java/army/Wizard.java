package army;

public class Wizard extends Character {
    public Wizard(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.print("The wizard ");
        super.attack();
        System.out.println("a staff and spells");
    }
}
