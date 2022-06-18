public class Titan extends Character{

    public Titan() {
        super(200,45,0);
    }

    @Override
    public boolean attack() {
        double random = Math.random() * 10;
        if(random <= 4.0){
            return true;
        }
        return false;
    }

    @Override
    public void info() {
        System.out.println(" =========== ENEMY ===========");
        super.info();
    }

    @Override
    public void receiveDamage(Character karakter) {
        super.receiveDamage(karakter);
    }
    
    
}
