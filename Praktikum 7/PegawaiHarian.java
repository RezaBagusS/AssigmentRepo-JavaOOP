public class PegawaiHarian extends Pegawai {
    
    private int upahPerJam;
    private int jamKerja;

    // Constructor
    public PegawaiHarian(String nama, String noKTP, int upahPerJam, int jamKerja){
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.jamKerja = jamKerja;
    }

    // Setter
    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }
    public void setUpahPerJam(int upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    // Getter 
    public double getUpahPerJam() {
        return upahPerJam;
    }
    public double getJamKerja() {
        return jamKerja;
    }

    // Function
    private double countGaji(){
        if(this.jamKerja <= 40){
            return this.upahPerJam * this.jamKerja;
        }else {
            // jmNormal*UpahPjam+(jmBaru - jmNormal)*UpahPjam*1,5
            return 40*this.upahPerJam+(this.jamKerja-40)*this.upahPerJam*1.5;
        }
    }

    @Override
    public double gaji() {
        return this.countGaji() ;
    }

    @Override
    public String toString() {
        super.toString();
        System.out.println("upah/jam : "+this.getUpahPerJam());
        System.out.println("Total Jam Kerja : "+this.getJamKerja());
        System.out.println("Gaji : Rp "+(int)this.gaji());
        return "";
    }

}
