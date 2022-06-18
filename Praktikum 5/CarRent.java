package pbo.praktikum;

public class CarRent {
    private CarRider rider; // Objek variabel dengan nama rider untuk menampung objek CarRider
    private Car car; // Objek variabel dengan nama car untuk menampung objek Car
    private int rentDur; // Variabel global untuk menampung nilai integer

    CarRent(CarRider rider, Car car, int rentDur){ // Constructor dengan 3 Parameter
        this.rider = rider; // Inisialisasi dari parameter(variabel lokal) ke variabel global
        this.car = car; // Inisialisasi dari parameter(variabel lokal) ke variabel global
        this.rentDur = rentDur; // Inisialisasi dari parameter(variabel lokal) ke variabel global
    }

    // Getter untuk mengembalikkan nilai CarRider
    public CarRider getRider() {
        return rider;
    }

    // Getter untuk mengembalikkan nilai Car
    public Car getCar() {
        return car;
    }

    // Getter untuk mengembalikkan nilai integer
    public int getRentDur() {
        return rentDur;
    }

}
