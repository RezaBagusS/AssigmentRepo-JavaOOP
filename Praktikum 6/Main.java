public class Main {
    public static void main(String[] args) {
        
        System.out.println(" ======= MANUSIA ======= ");
        // 4 Manusia Biasa
        Manusia man1 = new Manusia("Aku", "3923842934",true, true);
        System.out.println(man1.toString());
        Manusia man2 = new Manusia("M. Ni Bita", "1222222222",true, false);
        System.out.println(man2.toString());
        Manusia man3 = new Manusia("M. San Goku", "1333333333",true, false);
        System.out.println(man3.toString());
        Manusia man4 = new Manusia("M. Yon D Luffy", "1444444444",true, false);
        System.out.println(man4.toString());

        System.out.println("");
        System.out.println(" ======= MAHASISWA ======= ");
        // 4 Manusia Mahasiswa Filkom
        MahasiswaFilkom mhs1 = new MahasiswaFilkom("I Putu Yoga", "351923848239", false, false, "205150601111018", 3.70); 
        System.out.println(mhs1.toString());
        MahasiswaFilkom mhs2 = new MahasiswaFilkom("MF. Ro Hani", "222222222", false, true, "215150307111002", 3.62); 
        System.out.println(mhs2.toString());
        MahasiswaFilkom mhs3 = new MahasiswaFilkom("MF. Lu Kahini", "2333333333", false, true, "215150407111003", 3.53); 
        System.out.println(mhs3.toString());
        MahasiswaFilkom mhs4 = new MahasiswaFilkom("MF Pat Ungan", "2444444444", true, false, "215150707111004", 3.74); 
        System.out.println(mhs4.toString());

        System.out.println(" ======= PEKERJA ======= ");
        // 4 Manusia Pekerja
        Pekerja pekerja1 = new Pekerja(7, 22, "195102439283", "Iqbal Biondy", "351717969", true, true); 
        System.out.println(pekerja1.toString()); 
        Pekerja pekerja2 = new Pekerja(7, 22, "493102239282", "P. Ua Keren", "3222222222", false, true); 
        System.out.println(pekerja2.toString());
        Pekerja pekerja3 = new Pekerja(8, 23, "692102639283", "P. Ga Ring", "3333333333", false, true); 
        System.out.println(pekerja3.toString());
        Pekerja pekerja4 = new Pekerja(9, 24, "296102939284", "P. Pat Erasi", "3444444444", true, true); 
        System.out.println(pekerja4.toString());

        System.out.println(" ======= MANAJER ======= ");
        // 4 Manusia Pekerja Manajer
        Manajer manajer1 = new Manajer(9, 20, "204837283728", "Lyra Hertin", "351707384392", false,false, 1500);
        System.out.println(manajer1.toString());
        Manajer manajer2 = new Manajer(6, 22, "607838283722", "PM. Wo Xinting", "4222222222", true, false, 1700);
        System.out.println(manajer2.toString());
        Manajer manajer3 = new Manajer(11, 23, "702847283723", "PM. Ree Mar", "4333333333", false, false, 1600);
        System.out.println(manajer3.toString());
        Manajer manajer4 = new Manajer(12, 24, "101857283724", "PM. Ur Gent", "4444444444", true, true, 1000);
        System.out.println(manajer4.toString());

    }
}
