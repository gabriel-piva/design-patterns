package singleton;

public class Test {
    public static void main(String[] args) {
        System.out.println("## Singleton:\n");

        OneRing oneRing = OneRing.getInstance();
        System.out.println("# " + oneRing.getMessage());

        OneRing anotherOneRing = OneRing.getInstance();
        anotherOneRing.setMessage("One Ring to find them");
        System.out.println("# " + anotherOneRing.getMessage());

        System.out.println("\n# " + oneRing.getMessage());
        System.out.println("# " + anotherOneRing.getMessage() + '\n');
        System.out.println(oneRing == anotherOneRing);
    }
}
