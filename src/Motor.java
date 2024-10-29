// Motor.java
public class Motor extends Kendaraan {
    private String jenisMotor;

    public Motor(String nomorPolisi, String merk, String tipe, String jenisMotor) {
        super(nomorPolisi, merk, tipe);
        this.jenisMotor = jenisMotor;
    }

    // Getter dan Setter untuk jenisMotor
    public String getJenisMotor() {
        return jenisMotor;
    }

    public void setJenisMotor(String jenisMotor) {
        this.jenisMotor = jenisMotor;
    }

    // Overriding metode displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jenis Motor: " + jenisMotor);
    }
}

