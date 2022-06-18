package pbo.praktikum;
import java.util.Scanner;

public class Main2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CarData cardata = new CarData(); // Instansiasi Objek CarData dengan nama cardata
        
        System.out.println("");
        boolean loopMenu = true;
        while(loopMenu){ // Menu Aplikasi dengan While Loop
            System.out.println("========================");
            System.out.println("  APLIKASI  SEWA MOBIL  ");
            System.out.println("========================");
            System.out.println("");
            System.out.println("Daftar Menu :");
            System.out.println("1. Tambah Rider");
            System.out.println("2. Daftar Rider");
            System.out.println("3. Daftar Mobil");
            System.out.println("4. Rental Mobil");
            System.out.println("5. Informasi Pelanggan");
            System.out.println("6. Keluar");
            System.out.println("");
            System.out.print("Masukkan Pilihan Anda :");
            int menu = input.nextInt();input.nextLine(); // User memilih menu yang diinginkan
            System.out.println("------------------------");

            switch (menu) {
                case 1: // Menu pertama berfungsi menambah rider
                    System.out.println("Pilihan Anda : 1. Tambah Rider");
                    System.out.println("------------------------");
                    System.out.println("");
                    System.out.print("Masukkan nama : "); String name = input.nextLine(); // User Input Nama
                    System.out.print("Masukkan umur : "); int age = input.nextInt(); // User Input Umur
                    System.out.print("Masukkan No Tlp : "); input.nextLine(); String phone = input.nextLine(); // User Input No Tlp
                    System.out.println("");
                    System.out.println("------------------------");
                    CarRider.addRiderList(new CarRider(name, age, phone)); 
                    // instansiasi objek CarRider dengan parameter (nama, umur, no tlp) menggunakan fungsi static addRiderList()
                    // Sekaligus memasukkan objek CarRider ke dalam tipe data arraylist dengan nama riderList
                    System.out.println("------------------------");
                    System.out.println("");
                break;
                case 2: // Menu kedua berfungsi menampilkan semua daftar rider yang telah di tambahkan pada menu 1
                    System.out.println("Pilihan Anda : 2. Daftar Rider");
                    System.out.println("");
                    System.out.println("------------------------");
                    CarRider.tampilRider(); // Method static dengan nama tampilRider() guna menampilkan daftar rider yang ada
                    System.out.println("------------------------");
                    System.out.println("");
                break;
                case 3: // Menu ketiga berfungsi untuk menampilkan daftar mobil yang sudah di setting di luar client
                    System.out.println("Pilihan Anda : 3. Daftar Mobil");
                    System.out.println("");
                    cardata.listOfCar(); // method listOfCar() dari class CarData yang berisi tampilan daftar mobil yang tersedia
                    System.out.println("");
                break;
                case 4: // Menu keempat berfungsi untuk rider dapat menrental mobil yang diinginkannya
                    System.out.println("Pilihan Anda : 4. Rental Mobil");
                    if(CarRider.getSizeRider() == 0){ // Pengkondisian jika rider sama sekali belum ditambahkan / tidak ada
                        // Maka kondisi ini akan keluar
                        System.out.println("");
                        System.out.println("------------------------");
                        System.out.println("Tambahkan Rider Terlebih Dahulu");
                        System.out.println("------------------------");
                        System.out.println("");
                    }else { // Pengkondisian jika jumlah rider > 0
                        CarRider.tampilRider(); // Menampilkan listRider
                        System.out.println("");
                        cardata.listOfCar(); // Menampilkan listCar atau mobil yang tersedia dan tidak
                        // User input no urut Rider sesuai nomor di listRider
                        System.out.print("Masukkan nomor urut rider anda : "); int urutRider = input.nextInt();
                        // User input no urut mobil sesuai nomor di listCar
                        System.out.print("Masukkan nomor urut mobil yang ingin anda rental : "); int urutCar = input.nextInt();
                        // User input berapa lama mobil akan di rental
                        System.out.print("Masukkan durasi masa rental anda (jam) : "); int durRental = input.nextInt();
                        // vv Memasukkan data melalui method static void Rent() dengan parameter dari inputan user
                        RentArchive.Rent(CarRider.getCarRider(urutRider), CarData.getCar(urutCar), durRental); 
                    }
                break;
                case 5: // Menu kelima berfungsi menampilkan informasi terkait rider yang sudah melakukan transaksi rental mobil
                    System.out.println("Pilihan Anda : 5. Informasi Pelanggan");
                    System.out.println("");
                    RentArchive.info(); // Menampilkan Informasi pelanggan
                break;
                case 6: // Menu enam berfungsi untuk mengeluarkan dari while loop dan program akan berakhir
                    System.out.println("Pilihan Anda : 6. Keluar");
                    System.out.println("==================");
                    System.out.println("~~ TERIMA KASIH ~~");
                    System.out.println("==================");
                    input.close();
                    loopMenu = false;
                break;
            
                default: // Antisipasi jika user salah memasukkan inputan menu yang tidak sesuai (1 - 6)
                    System.out.println("");
                    System.err.println("====== ERROR ======");
                    System.out.println("  INVALID INPUT!!  ");
                    System.out.println("Please Input Again!");
                    System.out.println("===================");
                    System.out.println("");
                break;
            }
        }
    }

}
