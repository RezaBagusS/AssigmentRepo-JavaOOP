public class MahasiswaFilkom extends Manusia{
    
    private String NIM;
    private double IPK;

    public MahasiswaFilkom(String name, String NIK, boolean gender, boolean marriedStatus, String NIM, double IPK){
        super(name, NIK, gender, marriedStatus);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    // Setter
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    // Getter
    public String getNIM() {
        return NIM;
    }
    public double getIPK() {
        return IPK;
    }

    // Function
    public String status() {
        String angkatan = "";
        String prodi ="";
        angkatan = angkatan + getNIM().substring(0, 2);
        prodi = prodi + String.valueOf(getNIM().charAt(6));
        if(prodi.equals("2")){
            return "Teknik Meniup Gelembung, 20"+angkatan;
        }else if(prodi.equals("3")){
            return "Teknik Berburu Ubur Ubur, 20"+angkatan;
        }else if(prodi.equals("4")){
            return "Sistem Penghamburgeran, 20"+angkatan;
        }else if(prodi.equals("6")){
            return "Pendidikan Chum Bucket, 20"+angkatan;
        }else if(prodi.equals("7")){
            return "Teknologi Telepon Kerang, 20"+angkatan;
        }else {
            return "Identitas Anda Tidak Ditemukan";
        }
    }

    public double getBeasiswa() {
        if(this.getIPK() < 3.5 && this.getIPK() > 3.0){
            return 50.0;
        }else if(this.getIPK() < 4.0 && this.getIPK() >= 3.5 ){
            return 75.0;
        }else {
            return 0;
        }
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + this.getBeasiswa();
    }

    @Override
    public String toString() {
        super.toString();
        System.out.println("NIM : "+this.getNIM());
        System.out.println("IPK : "+this.getIPK());
        System.out.println("Status : "+this.status());
        return "";
    }

}
