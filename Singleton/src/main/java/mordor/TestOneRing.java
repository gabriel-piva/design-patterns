package mordor;

public class TestOneRing {
    public static void main(String[] args) {
        System.out.println("--------------------------------------");
        TestPowers.addPowers();
        TestBearers.addBearers();

        System.out.println("--------------------------------------");
        System.out.println("# One Ring powers:");
        for (String power : OneRing.getOneRing().getPowers()) {
            System.out.println(power);
        }
        System.out.println("--------------------------------------");
        System.out.println("# One Ring bearers:");
        for (String bearer : OneRing.getOneRing().getBearers()) {
            System.out.println(bearer);
        }
        System.out.println("--------------------------------------");
    }
}
