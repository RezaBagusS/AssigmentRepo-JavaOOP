package pbo.praktikum;

import java.util.ArrayList;

public class RentArchive {
    
    // private static arraylist untuk menampung nilai dgn tipe data CarRent
    private static ArrayList<CarRent> rentData = new ArrayList<CarRent>();
    
    // Method static void dengan 3 parameter
    public static void Rent(CarRider rider, Car car, int rentDur){ // + static
        // Menampilkan informasi terkait rental 
        System.out.println(rider.getName()+" try to rental "+car.getCarType()
        +" "+car.getMerk()+" with "+car.getPolNum()); 

        if(car.isStatus() == true){ // Pengkondisian jika status true maka sukses di sewa
            System.out.println("MOBIL BERHASIL DISEWA (SUCCESS)\n");
            car.setStatus(false); // status awalnya true berubah jadi false karena berhasil di sewa
            // Memasukkan data rental ke dalam arraylist yang menampung data dengan tipe data CarRent
            rentData.add(new CarRent(rider, car, rentDur)); 
        }else {
            System.out.println("MAAF, MOBIL SUDAH DISEWA (FAIL)\n"); // Informasi jika status sudah false sebelum di rental
        }
    }

    // static void utk menampilkan informasi terkait pelanggan
    public static void info() {
        System.out.println("=========================");
        System.out.println("   INFORMASI PELANGGAN   ");
        System.out.println("=========================");
        if(rentData.size() == 0){ // Pengkondisian untuk mengecek panjang array list dg tipe data CarRent
            System.out.println("");
            System.out.println("INFORMASI PELANGGAN MASIH BELUM ADA");
            System.out.println("");
        }
        for (CarRent carRent : rentData) { // For each utk menampilkan arraylist dg tipe data CarRent
            System.out.println("NAMA PEMINJAM   : "+carRent.getRider().getName()); // Menampilkan Nama Rider
            System.out.println("TIPE MOBIL      : "+carRent.getCar().getCarType()); // Menampilkan Tipe Mobil
            System.out.println("NO. POLISI      : "+carRent.getCar().getPolNum()); // Menampilkan Nomor Polisi
            System.out.println("LAMA RENTAL     : "+carRent.getRentDur()); // Menampilkan berapa lama rental
            System.out.println("-------------------------");
        }
    }
}
