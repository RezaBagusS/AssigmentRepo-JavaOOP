import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Database.addData(new Admin("Admin", "Admin"));

        boolean firstCheck = true;
        byte firstPage = 0, charPage = 0;
        String username, password, nickname;
        Titan titan = null;
        Healer healer = null;
    
        do {
            System.out.println("====== AoT Game Android ======");
            System.out.println("1. Login");
            System.out.println("2. Sign Up");
            System.out.println("3. Exit");
            do {
                System.out.print("Enter your choice (1 - 3) : ");
                try {
                    firstPage =  input.nextByte();
                    firstCheck = false;
                } catch (InputMismatchException e) {
                    System.out.println("\n******************************");
                    System.out.println("  Please  Input Number 1 - 3  ");
                    System.out.println("******************************\n");
                    input.next();
                    firstCheck = true;
                }
            } while (firstCheck); firstCheck = true;
    
            switch (firstPage) {
    
                case 1:
                    System.out.println("\n=========== Log in ==========="); input.nextLine();
                    System.out.print("Username/Email\t: "); username = input.nextLine();
                    System.out.print("Password\t: "); password = input.nextLine();
                    System.out.println("");

                    if(Database.checkAdmin(new Admin(username, password))){
                        firstCheck = false;
                        // LOGIN
                        System.out.println("====== Welcome  To Game ======");
                        System.out.print("Masukkan Nickname : ");
                        nickname = input.nextLine();
                        System.out.println("   >>>>> WELCOME "+nickname+" <<<<<");
                        System.out.println("");

                        System.out.println("       >>> Character <<<      ");
                        System.out.println("1. Magician");
                        System.out.println("2. Healer");
                        System.out.println("3. Warrior");
                        do {
                            System.out.print("Choose your Character (1 - 3) : ");
                            try {
                                titan = new Titan();
                                charPage =  input.nextByte();
                                if (charPage < 1 || charPage > 3) {
                                    System.out.println("\n******************************");
                                    System.out.println("  Please  Input Number 1 - 3  ");
                                    System.out.println("******************************\n");
                                    firstCheck = true;
                                }else {
                                    firstCheck = false;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("\n******************************");
                                System.out.println("  Please  Input Number 1 - 3  ");
                                System.out.println("******************************\n");
                                input.next();
                                firstCheck = true;
                            }
                        } while (firstCheck); firstCheck = true;

                        if(charPage == 1){
                            Database.checkAdmin(username, password).setKarakter(new Magician());
                        }else if(charPage == 2){
                            Database.checkAdmin(username, password).setKarakter(new Healer());
                        }else if(charPage == 3){
                            Database.checkAdmin(username, password).setKarakter(new Warrior());
                        }

                        System.out.println("\n"+nickname+" character : "+Database.checkAdmin(username, password).getKarakter().getClass().getSimpleName());
                        Database.checkAdmin(username, password).getKarakter().info();
                        
                        System.out.println("\n==============================");
                        System.out.println("       Ready to  Fight       ");
                        System.out.println("==============================\n");
                        
                        if (Database.checkAdmin(username, password).getKarakter() instanceof Healer) {
                            healer = (Healer) Database.checkAdmin(username, password).getKarakter();
                        }

                        for (int i = 0; firstCheck; i++) {
                            if (titan.getHP() > 0 && Database.checkAdmin(username, password).getKarakter().getHP() > 0) {
                                System.out.println("\n>======== TURN "+(i+1)+"==========");
                                if(i % 2 == 1){
                                    if(Database.checkAdmin(username, password).getKarakter() instanceof Healer) {
                                        healer.heal();
                                    }
                                }

                                if(Database.checkAdmin(username, password).getKarakter().attack()){
                                    Database.checkAdmin(username, password).getKarakter().receiveDamage(titan);
                                }

                                if(titan.attack()){
                                    titan.receiveDamage(Database.checkAdmin(username, password).getKarakter());
                                }

                                System.out.println(nickname+"'s HP : "+Database.checkAdmin(username, password).getKarakter().getHP());
                                System.out.println("Enemy's HP : "+titan.getHP());
                            }else {
                                firstCheck = false;
                            }
                        }
                        firstCheck = true;

                        System.out.println("");
                        if(titan.getHP() == 0){
                            System.out.println("     "+nickname+"'s WIN this Game     ");
                            System.out.println("      ***  YOU WIN  ***      ");
                        }else if(Database.checkAdmin(username, password).getKarakter().getHP() == 0){
                            System.out.println("    Titan's WIN this Game     ");
                            System.out.println("      ***  YOU LOSE  ***      ");
                        }
                        System.out.println("");

                        System.out.println("\n******************************");
                        System.out.println("   Statistic After Matching   ");
                        System.out.println("******************************\n");
                        Database.checkAdmin(username, password).getKarakter().info();
                        titan.info();
                        System.out.println("------------------------------");
                        System.out.println("");
                    }else {
                        firstCheck = true;
                        System.out.println("\n**** Akun Tidak Ditemukan ****\n");
                    }
                break;
    
                case 2:
                    System.out.println("\n=========== SignUp ==========="); input.nextLine();
                    System.out.print("Username/Email\t: "); username = input.nextLine();
                    System.out.print("Password\t: "); password = input.nextLine();
                    System.out.println("");

                    Database.addData(new Admin(username, password));
                break;
    
                case 3:
                    System.out.println("\n=========== Keluar ===========");
                    System.out.println("      ** Terima Kasih **      ");
                    System.out.println("==============================\n");
                    firstCheck = false;
                break;
            
                default:
                    System.out.println("\n******************************");
                    System.out.println("    -- Please Input 1-3 --    ");
                    System.out.println("******************************\n");
                break;
            }
        } while (firstCheck);

    }
}
