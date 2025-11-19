public class Main {
    public static void main(String[] args) {
        // Creating sectors based on image data
        // Sector(String name, int standingPlaces, int seatingPlaces, String
        // colorOfSector)
        Sector s1 = new Sector("F1", 150, 0, "Blue");
        Sector s2 = new Sector("L1", 50, 80, "Red");
        Sector s3 = new Sector("L2", 50, 80, "Red");
        Sector s4 = new Sector("L3", 20, 40, "Red");
        Sector s5 = new Sector("U1", 35, 95, "Yellow");
        Sector s6 = new Sector("U2", 35, 95, "Yellow");
        Sector s7 = new Sector("U3", 60, 70, "Yellow");

        // Creating MusicHall
        MusicHall hall = new MusicHall(s1, s2, s3, s4, s5, s6, s7);

        // Printing info
        hall.printInfo();

        // Testing capacity methods
        System.out.println("\n--- Testování kapacit ---");
        System.out.println("Celkem míst k sezení: " + hall.getSumOfSeatingPlaces());
        System.out.println("Celkem míst k stání: " + hall.getSumOfStandingPlaces());

        System.out.println("Místa k sezení (Červená): " + hall.getSumOfSeatingPlaces("Red"));
        System.out.println("Místa k stání (Modrá): " + hall.getSumOfStandingPlaces("Blue"));
    }
}
