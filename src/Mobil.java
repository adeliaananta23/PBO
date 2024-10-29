// Mobil.java
public class Mobil extends Kendaraan {
    private int kapasitasMesin;

    public Mobil(String nomorPolisi, String merk, String tipe, int kapasitasMesin) {
        super(nomorPolisi, merk, tipe);
        this.kapasitasMesin = kapasitasMesin;
    }

    // Getter dan Setter untuk kapasitasMesin
    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    // Overriding metode displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas Mesin: " + kapasitasMesin + " cc");
    }
}

