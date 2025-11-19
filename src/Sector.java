public class Sector {
    private int mistaKStani;
    private int mistaKSezeni;
    private String nazevSektoru;
    private String barvaSektoru;

    public Sector(String nazev, int mistaKStani, int mistaKSezeni, String barvaSektoru) {
        this.nazevSektoru = nazev;
        this.mistaKStani = mistaKStani;
        this.mistaKSezeni = mistaKSezeni;
        this.barvaSektoru = barvaSektoru;
    }

    public int getMistaKStani() {
        return mistaKStani;
    }

    public int getMistaKSezeni() {
        return mistaKSezeni;
    }

    public String getBarva() {
        return barvaSektoru;
    }

    public void vypisInfo() {
        System.out.println("Sektor: " + nazevSektoru);
        System.out.println("  Barva: " + barvaSektoru);
        System.out.println("  Místa k stání: " + mistaKStani);
        System.out.println("  Místa k sezení: " + mistaKSezeni);
    }
}
