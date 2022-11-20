package army;

public abstract class Character {
    private String name;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void attack(){
        System.out.print(getName() + " attacks with ");
    }
    @Override
    public String toString() {
        return "# " + getName() + " is in the army";
    }
}
