package pbo.praktikum;

public class Car {
    
    private String carType; // Variabel global menampung tipe mobil
    private String polNum; // Variabel global menampung Nomor Polisi
    private String merk; // Variabel global menampung merek Mobil
    private boolean status; // Variabel global menampung status mobil di rental atau tidak

    Car(String carType, String polNum, String merk,boolean status){ // Constructor dengan 3 Parameter
        this.carType = carType; // Inisialisasi dari parameter(variabel lokal) ke variabel global
        this.polNum = polNum; // Inisialisasi dari parameter(variabel lokal) ke variabel global
        this.merk = merk; // Inisialisasi dari parameter ke(variabel lokal) variabel global
        this.status = status; // Inisialisasi dari parameter(variabel lokal) ke variabel global
    }

    // Getter untuk mendapatkan nilai Nomor Polisi
    public String getPolNum() { 
        return polNum;
    }

    // Getter untuk mendapatkan nilai merek
    public String getMerk() {
        return merk;
    }

    // Getter untuk mendapatkan nilai tipe mobil
    public String getCarType() {
        return carType;
    }

    // Getter untuk mendapatkan nilai status mobil
    public boolean isStatus() {
        return status;
    }

    // Setter untuk mengubah/mengatur nilai status mobil
    public void setStatus(boolean status) {
        this.status = status;
    }

}
