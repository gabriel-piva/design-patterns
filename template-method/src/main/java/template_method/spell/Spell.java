package template_method.spell;

public abstract class Spell {
    public final void cast() {
        System.out.print("Preparing the wand");
        prepare();
        execute();
        System.out.print("Incantation complete!");
        conclude();
    }

    protected abstract void prepare();
    protected abstract void execute();
    protected abstract void conclude();
}
