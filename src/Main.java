public class Main {
    public static void main(String[] args) {
        Sector s1 = new Sector("F1", 150, 0, "Blue");
        Sector s2 = new Sector("L1", 50, 80, "Red");
        Sector s3 = new Sector("L2", 50, 80, "Red");
        Sector s4 = new Sector("L3", 20, 40, "Red");
        Sector s5 = new Sector("U1", 35, 95, "Yellow");
        Sector s6 = new Sector("U2", 35, 95, "Yellow");
        Sector s7 = new Sector("U3", 60, 70, "Yellow");

        MusicHall hall = new MusicHall(s1, s2, s3, s4, s5, s6, s7);

        hall.printInfo();

        System.out.println("\n--- Testovani kapacit ---");
        System.out.println("Celkem mist k sezeni: " + hall.getSumOfSeatingPlaces());
        System.out.println("Celkem mist k stani: " + hall.getSumOfStandingPlaces());

        System.out.println("Mista k sezeni (Cervena): " + hall.getSumOfSeatingPlaces("Red"));
        System.out.println("Mista k stani (Modra): " + hall.getSumOfStandingPlaces("Blue"));
    }
}
