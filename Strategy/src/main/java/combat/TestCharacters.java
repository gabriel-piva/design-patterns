package combat;

public class TestCharacters {
    public static void main(String[] args) {
        AttackBehavior sword = new SwordAttack();
        AttackBehavior bow = new BowAttack();
        AttackBehavior axe = new AxeAttack();

        System.out.println("----------------------------------------------\n");

        Character aragorn = new Character("Aragorn", sword);
        aragorn.combat();

        System.out.println("----------------------------------------------\n");

        Character legolas = new Character("Legolas", bow);
        legolas.combat();
        legolas.setAttackBehavior(sword);
        legolas.combat();

        System.out.println("----------------------------------------------\n");

        Character gimli = new Character("Gimli", axe);
        gimli.combat();

        System.out.println("----------------------------------------------");
    }
}
