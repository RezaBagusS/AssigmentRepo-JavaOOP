package pbo.praktikum;

public class Merchant {
    private String namaMerchant;
    private String namaProduk;
    private double hargaMakanan;
    
    // Constructor
    public Merchant(String namaMerchant, String namaProduk, double hargaMakanan){
        this.namaMerchant = namaMerchant;
        this.namaProduk = namaProduk;
        this.hargaMakanan = hargaMakanan;
    }

    // Getter
    public String getNamaMerchant() {
        return namaMerchant;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHargaMakanan() {
        return hargaMakanan;
    }

    // Setter
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public void setHargaMakanan(double hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }
    
    public void setNamaMerchant(String namaMerchant) {
        this.namaMerchant = namaMerchant;
    }
}
