package strategy;

import lombok.*;
import strategy.bending.ElementBending;

@AllArgsConstructor @Getter @Setter
public class Character {
    private String name;
    private ElementBending bending;

    public void attack() {
        System.out.println("# " + getName() + " " + getBending().bend());
    }
}
