// RiwayatServis.java
import java.util.ArrayList;

public class RiwayatServis {
    private Kendaraan kendaraan;
    private Pelanggan pelanggan;
    private ArrayList<Servis> daftarServis;

    public RiwayatServis(Kendaraan kendaraan, Pelanggan pelanggan) {
        this.kendaraan = kendaraan;
        this.pelanggan = pelanggan;
        this.daftarServis = new ArrayList<>();
    }

    public void tambahServis(Servis servis) {
        daftarServis.add(servis);
    }

    public void displayRiwayat() {
        System.out.println("Riwayat Servis untuk Kendaraan:");
        kendaraan.displayInfo();
        System.out.println("Pelanggan:");
        pelanggan.displayInfo();
        for (Servis servis : daftarServis) {
            System.out.println("Layanan: " + servis.getNamaLayanan() + ", Biaya: " + servis.getBiaya());
        }
    }
}
