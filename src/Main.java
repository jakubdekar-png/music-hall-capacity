import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Vytvoření sektorů podle údajů z obrázku
        // Sector(String nazev, int mistaKStani, int mistaKSezeni, String barvaSektoru)
        Sector s1 = new Sector("F1", 150, 0, "Modrá");
        Sector s2 = new Sector("L1", 50, 80, "Červená");
        Sector s3 = new Sector("L2", 50, 80, "Červená");
        Sector s4 = new Sector("L3", 20, 40, "Červená");
        Sector s5 = new Sector("U1", 35, 95, "Žlutá");
        Sector s6 = new Sector("U2", 35, 95, "Žlutá");
        Sector s7 = new Sector("U3", 60, 70, "Žlutá");

        // Vytvoření MusicHall
        MusicHall hala = new MusicHall(s1, s2, s3, s4, s5, s6, s7);

        // Výpis informací
        hala.vypisInfo();

        // Testování metod pro součty
        System.out.println("\n--- Testování kapacit ---");
        System.out.println("Celkem míst k sezení: " + hala.getCelkemMistKSezeni());
        System.out.println("Celkem míst k stání: " + hala.getCelkemMistKStani());
        
        System.out.println("Místa k sezení (Červená): " + hala.getCelkemMistKSezeni("Červená"));
        System.out.println("Místa k stání (Modrá): " + hala.getCelkemMistKStani("Modrá"));
    }
}
