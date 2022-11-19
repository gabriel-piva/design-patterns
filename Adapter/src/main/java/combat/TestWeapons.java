package combat;

public class TestWeapons {
    public static void main(String[] args) {
        Character legolas = new Character("Legolas");

        System.out.println("----------------------------------------------\n");

        Weapon sword = new Sword();
        legolas.setWeapon(sword);
        legolas.combat();

        System.out.println("\n----------------------------------------------\n");

        Weapon knives = new Knives();
        legolas.setWeapon(knives);
        legolas.combat();

        System.out.println("\n----------------------------------------------\n");

        Weapon bow = new BowAdapter();
        legolas.setWeapon(bow);
        legolas.combat();

        System.out.println("\n----------------------------------------------");
    }
}
