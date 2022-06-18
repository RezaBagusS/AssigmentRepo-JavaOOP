public class PegawaiTetap extends Pegawai {
    
    private int upah;

    // Cosntructor
    public PegawaiTetap(String nama, String noKTP, int upah){
        super(nama, noKTP);
        this.upah = upah;
    }

    // Setter 
    public void setUpah(int upah) {
        this.upah = upah;
    }

    // Getter
    public double getUpah() {
        return upah;
    }

    // Function
    @Override
    public double gaji() {
        return this.upah;
    }

    @Override
    public String toString() {
        super.toString();
        System.out.println("Upah : "+this.getUpah());
        System.out.println("Gaji : Rp "+(int)this.gaji());
        return "";
    }

}
