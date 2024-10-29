// SistemBengkel.java
public class SistemBengkel {
    public static void main(String[] args) {
        // Membuat objek Pelanggan
        Pelanggan pelanggan1 = new Pelanggan("Andi", "08123456789");

        // Membuat objek Mobil dan Motor
        Mobil mobil1 = new Mobil("B1234XYZ", "Toyota", "Avanza", 1500);
        Motor motor1 = new Motor("D5678ABC", "Honda", "Beat", "Matic");

        // Membuat objek RiwayatServis
        RiwayatServis riwayatMobil = new RiwayatServis(mobil1, pelanggan1);
        RiwayatServis riwayatMotor = new RiwayatServis(motor1, pelanggan1);

        // Menambahkan layanan servis
        riwayatMobil.tambahServis(new Servis("Ganti Oli", 150000));
        riwayatMobil.tambahServis(new Servis("Perbaikan Mesin", 500000));

        riwayatMotor.tambahServis(new Servis("Servis Rutin", 100000));

        // Menampilkan riwayat servis
        riwayatMobil.displayRiwayat();
        System.out.println();
        riwayatMotor.displayRiwayat();
    }
}
