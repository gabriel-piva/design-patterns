package army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<Character> characters;

    public Army() {
        characters = new ArrayList<>();
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }
    public void showCharacters() {
        System.out.println("----------------------------------------------");
        for(Character c : characters){
            System.out.println(c);
            c.attack();
            System.out.println("----------------------------------------------");
        }
    }
}
