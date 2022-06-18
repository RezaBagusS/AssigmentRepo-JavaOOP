public class Admin {
    
    private String username;
    private String password;
    private Character karakter;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    protected void setKarakter(Character karakter){
        this.karakter = karakter;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Character getKarakter() {
        return karakter;
    }
}
