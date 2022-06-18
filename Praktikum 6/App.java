import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Scanner input = new Scanner(System.in);
        // boolean menuLog = true;

        // do {
        //     String username = "";
        //     String password = "";
        //     System.out.println("=== APLIKASI PENDATAAN WARGA ===");
        //     System.out.println("1. Login");
        //     System.out.println("2. Sign Up");
        //     System.out.println("3. Keluar");
        //     System.out.print("Masukkan Pilihan (1-3) : ");
        //     byte cek = input.nextByte();
        //     switch(cek) {
        //         case 1 : 
        //             Authentication.defaultAdmin();
        //             System.out.print("Masukkan Email : "); input.nextLine();
        //             username = input.nextLine();
        //             System.out.print("Masukkan Password : ");
        //             password = input.nextLine(); 
        //             if (Authentication.authentication(username, password) == true) {
        //                 menuLog = false;
        //             }else {
        //                 System.out.println("Akun Tidak Ditemukan!!");
        //             }
        //         break;
        //         case 2 :
        //             System.out.print("Masukkan Email : "); input.nextLine();
        //             username = input.nextLine();
        //             System.out.print("Masukkan Password : ");
        //             password = input.nextLine(); 
        //             if (username.contains("@") && username.contains(".com") || username.contains("@") && username.contains(".id") ) {
        //                 Authentication.addAdmin(username, password);
        //                 System.out.println("Akun Berhasil Ditambahkan!!");
        //             } else {
        //                 System.out.println("Email Anda Salah!!");
        //             }
        //         break;
        //         case 3 :
        //             System.out.println("== Terima Kasih ==");
        //             input.close();
        //             menuLog = false;
        //         break;
        //         default : System.out.println("Masukkan sesuai format yang diminta !!");
        //     }
        // } while (menuLog);

        // menuLog = true;

        // do {
        //     boolean gender, statusMenikah;
        //     System.out.println(" === Selamat Datang === ");
        //     System.out.print("Masukkan Nama Anda : ");
        //     String nama = input.nextLine();
        //     System.out.print("Masukkan NIK : ");
        //     String NIK = input.nextLine();
        //     System.out.print("Jenis Kelamin (L/P) :");
        //     String kelamin = input.nextLine();
        //     if(kelamin == "L" || kelamin == "l"){
        //         gender = true;
        //     }else if (kelamin == "P" || kelamin == "p"){
        //         gender = false;
        //     }else throw new IllegalArgumentException("You Must be Input L or P");{
        //         menuLog = false;
        //     }
        //     System.out.println("*S : Sudah Menikah & B : Belum Menikah*");
        //     System.out.print("Status Pernikahan (S/B) : "); 
        //     String nikah = input.next();
        //     if(nikah != "S" || nikah != "s"){
        //         statusMenikah = true;
        //     }else if (nikah != "B" || nikah != "b"){
        //         statusMenikah = false;
        //     }else {
        //         statusMenikah = false; // WRONG
        //         menuLog = false; //
        //     }
        //     Admin.setMan(new Manusia(nama, NIK, gender, statusMenikah));
        // } while (menuLog);
        
        Manusia man1 = new Manusia("Aku", "3923842934",true, true);
        System.out.println(man1.toString());

        MahasiswaFilkom mhs1 = new MahasiswaFilkom("I Putu Yoga", "351923848239", false, false, "205150601111018", 3.70); 
        System.out.println(mhs1.toString());

        Pekerja pekerja1 = new Pekerja(7, 22, "195102439283", "Iqbal Biondy", "351717969", true, true); 
        System.out.println(pekerja1.toString()); 

        Manajer manajer1 = new Manajer(9, 20, "204837283728", "Lyra Hertin", "351707384392", false, false, 1500);
        System.out.println(manajer1.toString());

    }
}
