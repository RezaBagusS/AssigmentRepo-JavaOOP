package pbo.praktikum;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte cek;
        int sisi, alas, tinggi, jari2;
        cek = input.nextByte();

        switch(cek){
            case 1 : // Persegi
                sisi = input.nextInt();
                Persegi persegi1 = new Persegi(sisi);
                persegi1.hasilLuas();
            break;
            case 2 : // Segitiga
                alas = input.nextInt();
                tinggi = input.nextInt();
                Segitiga segitiga1 = new Segitiga(alas,tinggi);
                segitiga1.hasilLuas();
            break;
            case 3 : // Lingkaran
                jari2 = input.nextInt();
                Lingkaran lingkaran1 = new Lingkaran(jari2);
                lingkaran1.hasilLuas();
            break;
            default : // Else Inputan (1-3)
                System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}

class Persegi {
    private int luas;
    private int sisi;

    Persegi(int sisi){
        this.sisi = sisi;
        this.luas = 0;
    }

    private int luasPersegi(){
        this.luas = this.sisi * this.sisi;
        return this.luas;
    }

    public void hasilLuas(){
        System.out.println(luasPersegi());
    }
}

class Segitiga {
    private int alas;
    private int tinggi;
    private double luas;

    Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.luas = 0;
    }

    private int luasSegitiga(){
        this.luas = 0.5*this.alas*this.tinggi;
        return (int)this.luas;
    }

    public void hasilLuas(){
        System.out.println(luasSegitiga());
    }

}

class Lingkaran {
    private int jari2;
    private double phi;
    private double luas;

    Lingkaran(int jari2){
        this.jari2 = jari2;
        this.phi = 3.14;
        this.luas = 0;
    }

    private int luasLingkaran(){
        if(this.jari2 % 7 == 0){
            this.luas = 22/7 * this.jari2 * this.jari2;
        }else {
            this.luas = phi * this.jari2 * this.jari2;
        }
        return (int)this.luas;
    }

    public void hasilLuas(){
        System.out.println((double)luasLingkaran());
    }
}
