import java.util.ArrayList;

public class Database {

    private static ArrayList<Admin> admin = new ArrayList<>();

// Overloading Method
    public static void addData(Admin adminData){
        admin.add(adminData);
    }

// Function
    public static boolean checkAdmin(Admin adminData) {
        for (int i = 0; i < admin.size(); i++) {
            if(adminData.getUsername().equals(admin.get(i).getUsername()) &&
                adminData.getPassword().equals(admin.get(i).getPassword()))
                {
                return true;
            }
        }
        return false;
    }

    public static Admin checkAdmin(String username, String password) {
        for (int i = 0; i < admin.size(); i++) {
            if(admin.get(i).getUsername().equals(username) &&
                admin.get(i).getPassword().equals(password))
                {
                return admin.get(i);
            }
        }
        return null;
    }
}
