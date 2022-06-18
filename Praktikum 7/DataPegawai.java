import java.util.ArrayList;

public class DataPegawai {

    private static ArrayList<Pegawai> pegawaiTetap = new ArrayList<>();
    private static ArrayList<Pegawai> pegawaiHarian = new ArrayList<>();
    private static ArrayList<Pegawai> sales = new ArrayList<>();

    public static ArrayList<Pegawai> getPegawaiTetap() {
        return pegawaiTetap;
    }

    public static ArrayList<Pegawai> getPegawaiHarian() {
        return pegawaiHarian;
    }

    public static ArrayList<Pegawai> getSales() {
        return sales;
    }

    public static void dataSales(){
        sales.add(new Sales("Budi Sutaji", "712372173733", 50, 50000));
        sales.add(new Sales("Nguyen Van Strong", "216637213712", 70, 350000));
        sales.add(new Sales("Tratton Bunmattan", "364763467364", 20, 65000));
        sales.add(new Sales("Safee Salih", "123948978466", 45, 40000));
    }
    
    public static void dataPegawaiHarian(){
        pegawaiHarian.add(new PegawaiHarian("Joko Mariyadi", "34616837467187", 8500, 40));
        pegawaiHarian.add(new PegawaiHarian("Andre Taulany TV", "1236261381683", 11500, 52));
        pegawaiHarian.add(new PegawaiHarian("Surya Diningrat", "6437813846234", 8000, 47));
        pegawaiHarian.add(new PegawaiHarian("Decul Bin Nangis Anh", "0192328949915", 9000, 39));
    }

    public static void dataPegawaiTetap(){
        pegawaiTetap.add(new PegawaiTetap("Yongki Ari Sandi", "26371476274681", 2000000));
        pegawaiTetap.add(new PegawaiTetap("Reza Bagus Saputra", "3515112404030005", 4000000));
        pegawaiTetap.add(new PegawaiTetap("Abdul Rasyid Himawan", "7832918437480", 3800000));
        pegawaiTetap.add(new PegawaiTetap("Gavino Barca Lan Madrid", "1237346174673", 3500000));
    }

}
