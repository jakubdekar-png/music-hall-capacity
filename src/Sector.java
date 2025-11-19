public class Sector {
    private String nameOfSector;
    private int standingPlaces;
    private int seatingPlaces;
    private String colorOfSector;

    public Sector(String name, int standingPlaces, int seatingPlaces, String colorOfSector) {
        this.nameOfSector = name;
        this.standingPlaces = standingPlaces;
        this.seatingPlaces = seatingPlaces;
        this.colorOfSector = colorOfSector;
    }

    public int getStandingPlaces() {
        return standingPlaces;
    }

    public int getSeatingPlaces() {
        return seatingPlaces;
    }

    public String getColor() {
        return colorOfSector;
    }

    public void printInfo() {
        System.out.println("Sector: " + nameOfSector);
        System.out.println("  Color: " + colorOfSector);
        System.out.println("  Standing places: " + standingPlaces);
        System.out.println("  Seating places: " + seatingPlaces);
    }
}
