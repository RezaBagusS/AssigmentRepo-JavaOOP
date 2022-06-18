package pbo.praktikum;

import java.util.ArrayList;

public class CarRider {
    
    private String name; // Variabel global utk menampung nilai String dgn nama name
    private int age; // Variabel global utk menampung nilai integer dgn nama age
    private String phone; // Variabel global utk menampung nilai String dgn nama phone
    private static ArrayList<CarRider> riderList = new ArrayList<>(); // static Arraylist yang menampung nilai CarRider

    CarRider(String name, int age, String phone){ // Constructor dengan 3 parameter
        this.name = name; // Inisialisasi dari parameter(variabel lokal) ke variabel global
        this.age = age; // Inisialisasi dari parameter(variabel lokal) ke variabel global
        this.phone = phone; // Inisialisasi dari parameter(variabel lokal) ke variabel global
        // Memunculkan informasi bahwa rider berhasil ditambahkan ke dalam arraylist
        System.out.println(name+" has been added as Rider"); 
    }

    // Method static void untuk menambahkan nilai CarRider ke dalam arraylist
    public static void addRiderList(CarRider carRider) {
        riderList.add(carRider); // Atribut untuk menambahkan nilai ke dalam arraylist
    }

    // Method static int untuk mengembalikkan nilai integer berupa panjang arraylist
    public static int getSizeRider(){
        return riderList.size();
    }

    // Method static CarRider dengan 1 parameter utk mengembalikkan nilai CarRider
    public static CarRider getCarRider(int index){
        return riderList.get(index-1); // untuk mengambil nilai di dalam arraylist
    }

    // Method static void utk menampilkan daftar rider yang ada
    public static void tampilRider(){
        int i = 0; // Sebagai counter seperti pada i di for loop
        if(riderList.size() == 0){ // Pengkondisian untuk mengecek panjang arraylist
            System.out.println("Tidak Ada Rider yang Ditambahkan");
        }  
        for (CarRider carRider : riderList) { // For each untuk menampilkan setiap isi arraylist
            System.out.println("======= Rider "+(++i)+" =======");
            System.out.println("Nama : "+carRider.getName()); // Menampilkan Nama Rider
            System.out.println("Umur : "+carRider.getAge()); // Menampilkan Umur Rider
        }
    }

    // Getter utk mengembalikan nilai String nama
    public String getName() {
        return name;
    }

    // Getter utk mengembalikan nilai int umur
    public int getAge() {
        return age;
    }

    // Getter utk mengembalikkan nilai String nomor HP
    public String getPhone() {
        return phone;
    }

}
