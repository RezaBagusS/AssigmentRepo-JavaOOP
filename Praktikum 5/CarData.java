package pbo.praktikum;

import java.util.ArrayList;

public class CarData {
    
    // private static arraylist yang menampung data dengan tipe data Car
    private static ArrayList<Car> carList = new ArrayList<>(); 

    CarData(){ // Constructor Default
        this.listAddCar(); // Mengisi arraylist dengan mobil yang sudah di setting di luar mode client
    }

    // private void dengan 3 parameter utk menambahkan data mobil ke dalam arraylist
    private void addCar(String carType, String polNum, String merk) { 
        carList.add(new Car(carType,polNum,merk,true)); // Atribut arraylist utk menambahkan data 
    }

    // private method yang berfungsi untuk mengatur menambahkan mobil
    // Tempat menambahkan data dengan tipe data Car 
    private void listAddCar(){
        this.addCar("SUV", "N 1111 AB", "Honda");
        this.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        this.addCar("TRUCK", "N 3333 AB", "Suzuki");
        // TAMBAHAN 4 MOBIL
        this.addCar("SPORT", "N 4444 AB", "BMW");
        this.addCar("SPORT", "N 5555 AB", "Lamborghini");
        this.addCar("SUV", "N 6666 AB", "Toyota");
        this.addCar("TRUCK", "N 7777 AB", "Hino");
    }

    // Method void listOfCar() utk menampilkan daftar mobil 
    public void listOfCar() {
        int i = 0; // variabel utk menampilkan urutan
        System.out.println("========================");
        System.out.println("      DAFTAR MOBIL      ");
        System.out.println("========================");
        
        for (Car car : carList) { // for each utk menampilkan setiap isi arraylist
            if(car.isStatus() == true){ // Pengkondisian jika status mobil true
                System.out.println("======== Car "+ ++i +" =========");
                System.out.println("TIPE MOBIL : "+car.getCarType()); // Menampilkan tipe mobil
                System.out.println("NO. POLISI : "+car.getPolNum()); // Menampilkan tipe mobil
                System.out.println("MERK MOBIL : "+car.getMerk()); // Menampilkan tipe mobil
                System.out.println("------------------------");
            }else { // Pengkondisian jika status mobil false
                System.out.println("======= !Car "+ ++i +"! ========");
                System.out.println("TIPE MOBIL : "+car.getCarType()); // Menampilkan tipe mobil
                System.out.println("NO. POLISI : "+car.getPolNum()); // Menampilkan tipe mobil
                System.out.println("MERK MOBIL : "+car.getMerk()); // Menampilkan tipe mobil
                System.out.println("------------------------");
                System.out.println("== MOBIL SUDAH DISEWA ==");
                System.out.println("------------------------");
            }
        }
        System.out.println("");
    }

    // Getter static method dengan parameter utk mengembalikan dengan tipe data Car
    public static Car getCar(int index){
        return carList.get(index-1);
    }
}
