public class Manajer extends Pekerja{
    
    private int lamaKerja;

    Manajer(int jamKerja, int hariKerja,String NIP, String nama, String NIK, boolean gender, boolean statusMenikah, int lamaKerja){
        super(jamKerja, hariKerja,NIP, nama, NIK, gender, statusMenikah);
        this.lamaKerja = lamaKerja;
    }

    // Setter
    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    //Getter
    public int getLamaKerja() {
        return lamaKerja;
    }

    // Function
    @Override
    public double getPendapatan() {
        super.setBonus(getBonus() + getBonus()*3/100);
        return super.getPendapatan() + 15;
    }
    
    @Override
    public String toString() { 
        super.toString();
        System.out.println("Lama Kerja : "+this.getLamaKerja());
        return "";
    }
}
