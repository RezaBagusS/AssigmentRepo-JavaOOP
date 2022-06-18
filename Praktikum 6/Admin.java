public class Admin extends Authentication{
    private String name;
    private String password;
    private static Manusia man;
    
    // Constructor
    public Admin(String name, String password){
        this.name = name;
        this.password = password;
    }
    
    // Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public static void setMan(Manusia human) {
        man = human;
    }
    
    // Getter
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }

    public static boolean isMatch(String name, String password){
        // Rubah kode di sini
        for (int i = 0; i < admin.size(); i++) {
            if (admin.get(i).getName().equals(name) && admin.get(i).getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
