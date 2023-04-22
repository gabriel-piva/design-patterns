package template_method.spell;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ExpectoPatronum extends Spell {
    private String animal;

    @Override
    protected void prepare() {
        System.out.println(" and concentrating on happy memories");
    }
    @Override
    protected void execute() {
        System.out.print("Expecto Patronum! ");
        System.out.println(animal + " patronus appears");
    }
    @Override
    protected void conclude() {
        System.out.println(" Patronus fades away");
    }
}
