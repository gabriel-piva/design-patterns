package template_method.spell;

public class Expelliarmus extends Spell {
    @Override
    protected void prepare() {
        System.out.println(" and pointing it at the opponent's wand");
    }
    @Override
    protected void execute() {
        System.out.print("Expelliarmus!");
        System.out.println(" The opponent's wand is knocked out of their hand");
    }
    @Override
    protected void conclude() {
        System.out.println(" End of duel");
    }
}
