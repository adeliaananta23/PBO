// Servis.java
public class Servis {
    private String namaLayanan;
    private double biaya;

    public Servis(String namaLayanan, double biaya) {
        this.namaLayanan = namaLayanan;
        this.biaya = biaya;
    }

    // Getter dan Setter
    public String getNamaLayanan() {
        return namaLayanan;
    }

    public void setNamaLayanan(String namaLayanan) {
        this.namaLayanan = namaLayanan;
    }

    public double getBiaya() {
        return biaya;
    }

    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }
}
