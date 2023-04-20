package adapter;

import lombok.Setter;
import adapter.weapon.Weapon;

@Setter
public class Jedi {
    private String name;
    private Weapon weapon;

    public Jedi(String name) {
        this.name = name;
    }

    public void combat() {
        System.out.println("# " + name + weapon.attack());
    }
}
