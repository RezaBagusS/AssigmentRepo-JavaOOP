package pbo.praktikum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String type;
        int pcs;

        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan harga "+Baju.a);
        System.out.println("Baju B dengan harga "+Baju.b);
        System.out.println("Baju C dengan harga "+Baju.c);
        System.out.print("Baju yang akan anda beli bertipe : ");
        type = input.next();
        System.out.print("Jumlah Baju yang akan anda beli adalah : ");
        pcs = input.nextInt();

        Baju customer1 = new Baju(type,pcs);
        customer1.display();


    }
}
