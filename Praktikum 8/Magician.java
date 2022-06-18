public class Magician extends Character{

    public Magician() {
        super(100,60,10);
    }

    @Override
    public boolean attack() {
        double random = Math.random() * 10;
        if(random <= 3.5){
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
