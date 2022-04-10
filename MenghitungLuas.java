package pbo.praktikum;
import java.util.Scanner;

public class MenghitungLuas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte cek;
        int sisi, alas, tinggi, jari2;
        cek = input.nextByte();

        switch(cek){
            case 1 : // Persegi
                sisi = input.nextInt();
                luasPersegi(sisi);
            break;
            case 2 : // Segitiga
                alas = input.nextInt();
                tinggi = input.nextInt();
                luasSegitiga(alas, tinggi);
            break;
            case 3 : // Lingkaran
                jari2 = input.nextInt();
                luasLingkaran(jari2);
            break;
            default : // Else Inputan (1-3)
                System.out.println("Input yang anda masukan tidak sesuai");
        }
    }

    public static void luasPersegi(int sisi){
        int luas = sisi*sisi;
        System.out.println(luas);
    }

    public static void luasSegitiga(int alas, int tinggi){
        double luas = 0.5*alas*tinggi;
        System.out.println((int)luas);
    }

    public static void luasLingkaran(int jari2){
        double luas,phi = 3.14;
        if(jari2 % 7 == 0){
            luas = 22/7 * jari2 * jari2;
        }else {
            luas = phi * jari2 * jari2;
        }
        int luasAkhir = (int)luas;
        System.out.println((double)luasAkhir);
    }
}