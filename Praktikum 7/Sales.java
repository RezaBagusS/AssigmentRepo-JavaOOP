public class Sales extends Pegawai{
    
    private int totalPenjualan;
    private int komisi;

    public Sales(String nama, String noKTP, int totalPenjualan, int komisi){
        super(nama, noKTP);
        this.totalPenjualan = totalPenjualan;
        this.komisi = komisi;
    }

    // Setter
    public void setTotalPenjualan(int totalPenjualan) {
        this.totalPenjualan = totalPenjualan;
    }
    public void setKomisi(int komisi) {
        this.komisi = komisi;
    }

    // Getter
    public double getTotalPenjualan() {
        return totalPenjualan;
    }
    public double getKomisi() {
        return komisi;
    }

    // Function
    private double countGaji(){
        return this.getTotalPenjualan() * this.komisi;
    }

    @Override
    public double gaji() {
        return this.countGaji();
    }

    @Override
    public String toString() {
        super.toString();
        System.out.println("Total Penjualan : "+this.getTotalPenjualan());
        System.out.println("Komisi : "+ this.getKomisi());
        System.out.println("Gaji : Rp "+(int)this.gaji());
        return "";
    }
}
