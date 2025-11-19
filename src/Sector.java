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
        System.out.println("Sektor: " + nameOfSector);
        System.out.println("  Barva: " + colorOfSector);
        System.out.println("  Mista k stani: " + standingPlaces);
        System.out.println("  Mista k sezeni: " + seatingPlaces);
    }
}
