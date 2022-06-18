public class Healer extends Character{

    public Healer() {
        super(70, 10, 10);
    }

    @Override
    public boolean attack() {
        double random = Math.random() * 10;
        if(random <= 8.5){
            return true;
        }
        return false;
    }

    public void heal(){
        this.setHP(this.getHP()+25);
        System.out.println("### Skill Heal  Diaktifkan ###");
    }

    @Override
    public void info() {
        System.out.println("=========== PLAYER ===========");
        super.info();
    }

    @Override
    public void receiveDamage(Character karakter) {
        super.receiveDamage(karakter);
    }
}
