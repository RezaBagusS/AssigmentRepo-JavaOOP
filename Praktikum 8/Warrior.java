public class Warrior extends Character{

    public Warrior() {
        super(80, 25, 30);
    }

    @Override
    public boolean attack() {
        double random = Math.random() * 10;
        if(random <= 6.0){
            return true;
        }
        return false;
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
