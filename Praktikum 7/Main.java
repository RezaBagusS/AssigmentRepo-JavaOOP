import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Add Data from DataPegawai
        DataPegawai.dataPegawaiTetap();
        DataPegawai.dataPegawaiHarian();
        DataPegawai.dataSales();

        // Tampilan Menu
        boolean menu = true;
        do {
            System.out.println("==================================");
            System.out.println("== DATA PEGAWAI PERUSAHAAN PTIC ==");
            System.out.println("==================================");
            System.out.println("1. List Pegawai Perusahaan");
            System.out.println("2. Cari Data Pegawai");
            System.out.println("3. Keluar");
    
            System.out.println("");
            System.out.print("Masukkan Pilihan Anda 1-3 : "); // User Input Menu
            byte cekMenu = 0;
    
            // Utk Mengecek inputan User Valid atau tidak
            try {
                cekMenu = input.nextByte();
                if(cekMenu <= 0 || cekMenu > 3){
                    throw new IllegalArgumentException("");
                }
            } catch (Exception e) {
                if(cekMenu <= 0){
                    throw new IllegalArgumentException("Please Input Number On Range >> (1 - 3)");
                }else {
                    throw new IllegalArgumentException("Just Input 1 - 3 !! If Another input, Program will be Error");
                }
            }
    
            if(cekMenu == 1) // List Pegawai
            {
                int no = 0;
                System.out.println("");
                System.out.println(" --------------------------------- ");
                System.out.println(" >> LIST PEGAWAI TETAP <<");
                for (Pegawai tetap : DataPegawai.getPegawaiTetap()) {
                    System.out.println(++no + ". " + tetap.getNama());
                }
    
                no = 0;
                System.out.println("");
                System.out.println(" >> LIST PEGAWAI HARIAN <<");
                for (Pegawai harian : DataPegawai.getPegawaiHarian()) {
                    System.out.println(++no + ". " + harian.getNama());
                }
    
                no = 0;
                System.out.println("");
                System.out.println(" >> LIST PEGAWAI HARIAN <<");
                for (Pegawai sales : DataPegawai.getSales()) {
                    System.out.println(++no + ". " + sales.getNama());
                }
                System.out.println(" --------------------------------- ");
                System.out.println("");
            }
            else if (cekMenu == 2) // Cari Data Pegawai
            {
                boolean search = true;
                System.out.println("");
                System.out.print("Masukkan Nomor KTP Anda : "); input.nextLine();
                String KTP = input.nextLine();
                System.out.println("");
                do {
                    // Cek Pegawai Tetap
                    System.out.println(" --------------------------------- ");
                    for (Pegawai tetap : DataPegawai.getPegawaiTetap()) {
                        if(KTP.equals(tetap.getNoKTP())){
                            System.out.println("        >> Pegawai Tetap <<        ");
                            System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
                            tetap.toString();
                            search = false;
                        }
                    }
                    
                    // Cek Pegawai Harian
                    for (Pegawai harian : DataPegawai.getPegawaiHarian()) {
                        if(KTP.equals(harian.getNoKTP())){
                            System.out.println("        >> Pegawai Harian <<       ");
                            System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
                            harian.toString();
                            search = false;
                        }
                    }
    
                    // Cek Sales
                    for (Pegawai sales : DataPegawai.getSales()) {
                        if(KTP.equals(sales.getNoKTP())){
                            System.out.println("            >> Sales <<            ");
                            System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
                            sales.toString();
                            search = false;
                        }
                    }
                    System.out.println(" --------------------------------- ");
                    System.out.println("");

                    if(search == true){
                        System.out.println("");
                        System.out.println(" --------------------------------- ");
                        System.out.println("   MAAF NOMOR KTP TIDAK TERDAFTAR  ");
                        System.out.println(" --------------------------------- ");
                        System.out.println("");
                        search = false;
                    }
                } while (search);
    
            }
            else if (cekMenu == 3) // Keluar
            {
                System.out.println("");
                System.out.println("          ~~ TERIMA KASIH ~~          ");
                System.out.println(" ~~ TELAH MENGGUNAKAN APLIKASI KAMI ~~");
                System.out.println("");
                menu = false;
            }
        } while (menu);
    } 

}
