public abstract class Pegawai {
    
    private String nama;
    private String noKTP;

    // Constructor
    public Pegawai(String nama, String noKTP){
        this.nama = nama;
        this.noKTP = noKTP;
    }

    // Getter 
    public String getNama() {
        return nama;
    }
    public String getNoKTP() {
        return noKTP;
    }

    // Function
    public abstract double gaji();

    @Override
    public String toString() {
        System.out.println("Nama : "+ this.nama);
        System.out.println("No KTP : "+ this.noKTP);
        return "";
    }
}
