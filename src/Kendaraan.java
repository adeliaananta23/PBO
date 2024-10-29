public class Kendaraan {
        private String nomorPolisi;
        private String merk;
        private String tipe;

        // Constructor overloading
        public Kendaraan(String nomorPolisi) {
            this.nomorPolisi = nomorPolisi;
        }

        public Kendaraan(String nomorPolisi, String merk, String tipe) {
            this.nomorPolisi = nomorPolisi;
            this.merk = merk;
            this.tipe = tipe;
        }

        // Getter dan Setter (Encapsulation)
        public String getNomorPolisi() {
            return nomorPolisi;
        }

        public void setNomorPolisi(String nomorPolisi) {
            this.nomorPolisi = nomorPolisi;
        }

        public String getMerk() {
            return merk;
        }

        public void setMerk(String merk) {
            this.merk = merk;
        }

        public String getTipe() {
            return tipe;
        }

        public void setTipe(String tipe) {
            this.tipe = tipe;
        }

        // Polymorphism dengan metode displayInfo yang akan dioverride
        public void displayInfo() {
            System.out.println("Nomor Polisi: " + nomorPolisi + ", Merk: " + merk + ", Tipe: " + tipe);
        }
    }


