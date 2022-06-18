package pbo.praktikum;
import java.util.Scanner;

public class DataMerchant{
    static Scanner input = new Scanner(System.in);
    static Merchant[] merc = new Merchant[4];

    public static Merchant[] tambahMerchant(Merchant merchant){
        boolean cek = true;
        int i = 0;
        
        while (cek) {
            if(merc[i] == null){
                merc[i] = merchant;
                cek = false;
            }
            i++;
        }
        
        return merc;

        // do {
        //     System.out.println("====Tampilan Data Merchant UBFood====");
        //     System.out.println("Nama Merchant  : "+merchant.getNamaMerchant());
        //     System.out.println("Nama Produk    : "+merchant.getNamaProduk());
        //     System.out.println("Harga          : "+(int)merchant.getHargaMakanan());
        // } while (false);
    }

    public static void tampilData() {
        tambahMerchant(new Merchant(input.nextLine(), input.nextLine(), input.nextInt()));
        for (Merchant mch : merc) {
            System.out.println("====Tampilan Data Merchant UBFood====");
            System.out.println("Nama Merchant  : "+mch.getNamaMerchant());
            System.out.println("Nama Produk    : "+mch.getNamaProduk());
            System.out.println("Harga          : "+(int)mch.getHargaMakanan());
        }
        System.out.println("\n    ==== Reza  Bagus Saputra ====");
        System.out.println("     ===== 215150607111002 =====\n");
    }

    public static Merchant cariMerchant(String nama) {
        Merchant search = null;
        for (int i = 0; i < merc.length;i++) {
            if (merc[i].getNamaMerchant().equalsIgnoreCase(nama)) {
                System.out.println(merc[i].getNamaMerchant());
                return merc[i];
            }
        }
        return search;
    }

    public static void tampilMerchant(Merchant merchant) {
        System.out.println("==== Data "+merchant.getNamaMerchant()+" ====");
        System.out.println("Nama Merchant  : "+merchant.getNamaMerchant());
        System.out.println("Nama Produk    : "+merchant.getNamaProduk());
        System.out.println("Harga          : "+(int)merchant.getHargaMakanan());
    }

    public static void updateMerchant(Merchant merchant) {
        System.out.println("=== Update Merchant ===");
        System.out.println("1. Nama Merchant  : "+merchant.getNamaMerchant());
        System.out.println("2. Nama Produk    : "+merchant.getNamaProduk());
        System.out.println("3. Harga          : "+(int)merchant.getHargaMakanan());
        System.out.print("Pilih yang ingin anda ubah (1 - 3) : "); int update = input.nextInt();

        switch(update){
            case 1 : 
                System.out.println("Merchant Name  : "+merchant.getNamaMerchant());
                System.out.println("New Merchant Name  : "); 
                merchant.setNamaMerchant(input.nextLine());
            break;

            case 2 :
                System.out.println("Product Name    : "+merchant.getNamaProduk());
                System.out.println("New Product Name  : ");
                merchant.setNamaProduk(input.nextLine());
            break;

            case 3 : 
                System.out.println("Price    : "+merchant.getHargaMakanan());
                System.out.println("New Price  : ");
                merchant.setHargaMakanan(input.nextInt());
            break;

            default : System.out.println("Please Input number 1 until 3 !!");
        }

    }
}
