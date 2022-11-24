package locations;

public class TestLocations {
    public static void main(String[] args) {
        LocationTemplate location;

        System.out.println("----------------------------------------------");

        location = new Gondor(3425000);
        location.describeLocation();

        System.out.println("----------------------------------------------");

        location = new Shire(10000);
        location.describeLocation();

        System.out.println("----------------------------------------------");

        location = new Rivendell(4000);
        location.describeLocation();

        System.out.println("----------------------------------------------");
    }
}
