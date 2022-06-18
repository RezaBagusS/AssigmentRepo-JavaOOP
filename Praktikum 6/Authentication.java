import java.util.ArrayList;

public class Authentication {

    protected static ArrayList<Admin> admin = new ArrayList<>();
    private static ArrayList<MahasiswaFilkom> mhs = new ArrayList<>();
    private static ArrayList<Pekerja> worker = new ArrayList<>();
    private static ArrayList<Manajer> manager = new ArrayList<>();

    public static void defaultAdmin(){
        admin.add(new Admin("admin@gmail.com", "admin"));
    }

    static void addAdmin(String username, String password){
        admin.add(new Admin(username, password));
    }

    static boolean authentication(String username, String password) {
        return Admin.isMatch(username, password);
    }

}
