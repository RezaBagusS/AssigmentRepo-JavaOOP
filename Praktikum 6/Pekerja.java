public class Pekerja extends Manusia{
    
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    Pekerja(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean gender, boolean statusMenikah){
        super(nama, NIK, gender, statusMenikah);
        this.NIP = NIP;
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.gaji = 0;
        this.bonus = 0;
    }

    // Setter
    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }
    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
    protected void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Getter
    public double getGaji() {
        return gaji;
    }
    public double getBonus() {
        return bonus;
    }
    public int getJamKerja() {
        return jamKerja;
    }
    public int getHariKerja() {
        return hariKerja;
    }
    public String getNIP() {
        return NIP;
    }

    // Function
    private void gajiNormal(){
        this.gaji = this.getHariKerja() * this.getJamKerja() * 15;
    } 

    private void bonusLembur() {
        int hariBiasa = this.getHariKerja() - this.getHariKerja() / 7 * 2;
        int jamLembur = this.getJamKerja() - 7;
        this.bonus = this.bonus + hariBiasa * jamLembur * 7;
    } 

    private void bonusLibur(){
        int hariLibur = this.getHariKerja() / 7 * 2;
        this.bonus = this.bonus + hariLibur * this.jamKerja * 20;
    }

    @Override
    public double getPendapatan(){
        this.gajiNormal();
        this.bonusLibur();
        if (this.getJamKerja() > 7){
            this.bonusLembur();
        }
        return super.getPendapatan() + this.gaji + this.bonus; 
    }

    private String getKantorCabang(){
        if(this.NIP.charAt(0) == '1'){
            return "Mondstadt";
        }else if(this.NIP.charAt(0) == '2'){
            return "Liyue";
        }else if(this.NIP.charAt(0) == '3'){
            return "Inazuma";
        }
        else if(this.NIP.charAt(0) == '4'){
            return "Sumeru";
        }
        else if(this.NIP.charAt(0) == '5'){
            return "Fontaine";
        }
        else if(this.NIP.charAt(0) == '6'){
            return "Natlan";
        }
        else if(this.NIP.charAt(0) == '7'){
            return "Snezhnaya";
        }else {
            return "NIP Tidak Terdeteksi !!";
        }
    }

    private String getNomorCabang() {
        return String.valueOf(this.NIP.charAt(2));
    }

    private String getDepartemen(){
        if(this.NIP.charAt(6) == '1'){
            return "Pemasaran";
        }else if(this.NIP.charAt(6) == '2'){
            return "Humas";
        }else if(this.NIP.charAt(6) == '3'){
            return "Riset";
        }else if(this.NIP.charAt(6) == '4'){
            return "Teknologi";
        }else if(this.NIP.charAt(6) == '5'){
            return "Personalia";
        }else if(this.NIP.charAt(6) == '6'){
            return "Akademik";
        }else if(this.NIP.charAt(6) == '6'){
            return "Administrasi";
        }else if(this.NIP.charAt(6) == '8'){
            return "Operasional";
        }else if(this.NIP.charAt(6) == '9'){
            return "Pembangunan";
        }else {
            return "NIP Tidak Terdeteksi !!";
        }
    }

    public String getStatus() {
        return this.getDepartemen() +", "+ this.getKantorCabang() +" cabang ke-"+this.getNomorCabang();
    }

    @Override
    public String toString() {
        super.toString();
        System.out.println("Gaji : "+this.getGaji());
        System.out.println("Bonus : "+this.getBonus());
        System.out.println("Status : "+this.getStatus());
        return "";
    }
}
