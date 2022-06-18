package pbo.praktikum;
import java.util.Scanner;

public class SaldoNasabah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldo;
        int setor;

        saldo = input.nextInt();
        if(saldo >= 0 && saldo <= 2_147_483_647){
            setor = input.nextInt();

            saldoAkhir( bonus( saldoAwal( saldo, setor)));
        }
    }

    public static double saldoAwal(double saldo, int setor){
        saldo = saldo + (double)setor - 7000;
        return saldo;
    }

    public static double bonus(double saldo){
        double bonus = saldo*0.0005;
        saldo = saldo+bonus;
        return saldo;
    }

    public static void saldoAkhir(double saldo){
        System.out.println(saldo);
    }
}
