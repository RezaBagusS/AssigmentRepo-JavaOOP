package pbo.praktikum;
import java.util.Scanner;

public class SuratKaisar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text ;
        int move;

        text = input.nextLine();
        move = input.nextInt();

        finalHasil(text, move);

    }

    public static void finalHasil(String text, int move){

        char spasi = ' ';

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < 26; j++){
                proses(text, move, i, j);
            }
            
            boolean cek = text.charAt(i) == spasi;
            if (cek) {
            System.out.print(spasi);
        }
        }
    }
    
    public static void proses(String text, int move, int i, int j){
        char[] letterLower = {
            'a','b','c','d','e','f',
            'g','h','i','j','k',
            'l','m','n','o','p',
            'q','r','s','t','u',
            'v','w','x','y','z'
        };
        
        char[] letterUpper = {
            'A','B','C','D','E','F',
            'G','H','I','J','K',
            'L','M','N','O','P',
            'Q','R','S','T','U',
            'V','W','X','Y','Z'
        };

        int storageInt = 0;
        boolean cek;
        cek = text.charAt(i) == letterLower[j] ;
        if (cek) {
            storageInt = j + move;
            System.out.print(letterLower[storageInt%26]);
        }

        cek = text.charAt(i) == letterUpper[j];
        if (cek) {
            storageInt = j + move;
            System.out.print(letterUpper[storageInt%26]);
        }

        // cek = text.charAt(i) == symbol[0];
        // if (cek) {
        //     System.out.print(symbol[0]);
        // }
    }
}
