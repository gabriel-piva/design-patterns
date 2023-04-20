package facade.company;

public abstract class Character {
    protected String name;
    protected String type;

    public Character(String name) {
        this.name = name;
    }

    public void describe(){
        System.out.println("# The " + type + " " + name + " is in the adventure!");
    };
}
