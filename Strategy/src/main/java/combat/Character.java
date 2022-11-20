package combat;

public class Character {
    private String name;
    private AttackBehavior attackBehavior;

    // Constructor
    public Character(String name, AttackBehavior attackBehavior) {
        setName(name);
        setAttackBehavior(attackBehavior);
    }

    // Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public AttackBehavior getAttackBehavior() {
        return attackBehavior;
    }
    public void setAttackBehavior(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }

    // Method
    public void combat() {
        System.out.println("# " + getName() + attackBehavior.attack() + "\n");
    }
}
