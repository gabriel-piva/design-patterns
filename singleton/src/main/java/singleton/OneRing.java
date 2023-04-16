package singleton;

import lombok.*;

@Getter @Setter
public class OneRing {
    private static OneRing oneRing;
    private String message;

    private OneRing() {
       setMessage("One Ring to rule them all");
    }
    public static OneRing getInstance() {
        if(oneRing == null) oneRing = new OneRing();
        return oneRing;
    }
}
