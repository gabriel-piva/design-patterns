package combat;

public class Character {
    private String name;
    private Weapon weapon;

    // Constructor
    public Character(String name) {
        setName(name);
    }

    // Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // Methods
    public void equipWeapon() {
        System.out.print(getName());
        this.getWeapon().using();
    }
    public void describeWeapon() {
        this.getWeapon().description();
    }
    public void useWeapon() {
        System.out.print(getName());
        this.getWeapon().attack();
    }
    public void combat() {
        equipWeapon();
        describeWeapon();
        useWeapon();
    }
}
