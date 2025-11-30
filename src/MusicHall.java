public class MusicHall {
    private Sector[] sectors;

    public MusicHall(Sector s1, Sector s2, Sector s3, Sector s4, Sector s5, Sector s6, Sector s7) {
        this.sectors = new Sector[]{s1, s2, s3, s4, s5, s6, s7};
    }

    public int getSumOfSeatingPlaces() {
        int sum = 0;
        for (Sector sector : sectors) {
            sum += sector.getSeatingPlaces();
        }
        return sum;
    }

    public int getSumOfSeatingPlaces(String onlyForColor) {
        int sum = 0;
        for (Sector sector : sectors) {
            if (sector.getColor().equals(onlyForColor)) {
                sum += sector.getSeatingPlaces();
            }
        }
        return sum;
    }

    public int getSumOfStandingPlaces() {
        int sum = 0;
        for (Sector sector : sectors) {
            sum += sector.getStandingPlaces();
        }
        return sum;
    }

    public int getSumOfStandingPlaces(String onlyForColor) {
        int sum = 0;
        for (Sector sector : sectors) {
            if (sector.getColor().equals(onlyForColor)) {
                sum += sector.getStandingPlaces();
            }
        }
        return sum;
    }

    public void printInfo() {
    System.out.println("Informace o koncertnim sale:");
        for (Sector sector : sectors) {
            sector.printInfo();
        }
        System.out.println("Celkova kapacita k sezeni: " + getSumOfSeatingPlaces());
        System.out.println("Celkova kapacita k stani: " + getSumOfStandingPlaces());
    }
}
