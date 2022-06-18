
public class Manusia {
    
    private String nama;
    private String NIK;
    private boolean gender; // True (L) & False (P)
    private boolean statusMenikah; // True(Sudah) & False(Belom)

    public Manusia(String nama, String NIK, boolean gender, boolean statusMenikah){
        this.nama = nama;
        this.NIK = NIK;
        this.gender = gender;
        this.statusMenikah = statusMenikah;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNIK(String nIK) {
        NIK = nIK;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public void setStatusMenikah(boolean statusMenikah) {
        this.statusMenikah = statusMenikah;
    }

    // Getter
    public String getNama() {
        return nama;
    }
    public String getNIK() {
        return NIK;
    }
    public boolean isGender() {
        return gender;
    }
    public boolean isStatusMenikah() {
        return statusMenikah;
    }

    // Function
    private String getGender(){
        if(isGender() == true){
            return "Laki-Laki";
        }else {
            return "Perempuan";
        }
    }

    public double getTunjangan() {
        if(isStatusMenikah() == true){
            if(isGender() == true){
                return 25.0;
            }else {
                return 20.0;
            }
        }else {
            return 15.0;
        }
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    @Override
    public String toString() {
        System.out.println("-----------------------------------");
        System.out.println("Nama : "+this.nama);
        System.out.println("NIK : "+this.NIK);
        System.out.println("Jenis Kelamin : "+this.getGender());
        System.out.println("Pendapatan : "+this.getPendapatan()+"$");
        return "";
    }



}
