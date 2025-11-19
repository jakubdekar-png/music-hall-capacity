import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicHall {
    private List<Sector> sektory;

    public MusicHall(Sector... sektory) {
        this.sektory = new ArrayList<>(Arrays.asList(sektory));
    }

    public int getCelkemMistKSezeni() {
        int celkem = 0;
        for (Sector s : sektory) {
            celkem += s.getMistaKSezeni();
        }
        return celkem;
    }

    public int getCelkemMistKSezeni(String pouzeProBarvu) {
        int soucet = 0;
        for (Sector s : sektory) {
            if (s.getBarva().equals(pouzeProBarvu)) {
                soucet += s.getMistaKSezeni();
            }
        }
        return soucet;
    }

    public int getCelkemMistKStani() {
        int celkem = 0;
        for (Sector s : sektory) {
            celkem += s.getMistaKStani();
        }
        return celkem;
    }

    public int getCelkemMistKStani(String pouzeProBarvu) {
        int soucet = 0;
        for (Sector s : sektory) {
            if (s.getBarva().equals(pouzeProBarvu)) {
                soucet += s.getMistaKStani();
            }
        }
        return soucet;
    }

    public void vypisInfo() {
        System.out.println("Informace o koncertním sále:");
        System.out.println("----------------------------");
        for (Sector s : sektory) {
            s.vypisInfo();
        }
        System.out.println("----------------------------");
        System.out.println("Celková kapacita k sezení: " + getCelkemMistKSezeni());
        System.out.println("Celková kapacita k stání: " + getCelkemMistKStani());
    }
}
