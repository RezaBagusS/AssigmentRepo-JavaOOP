public abstract class Character {
    
    private int defense;
    private int attack;
    private int HP;

/**
 * Constructor
 */
    public Character(int HP, int attack, int defense) {
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }

/**
 * SETTER
 */
    protected void setHP(int HP) {
        this.HP = HP;
    }

    protected void setAttack(int attack) {
        this.attack = attack;
    }

    protected void setDefense(int defense) {
        this.defense = defense;
    }

/**
 * GETTER
 */
    public int getDefense() {
        return defense;
    }

    public int getAttack() {
        return attack;
    }

    public int getHP() {
        return HP;
    }

/**
 * FUNCTION
 */

// Abstract Method
    public abstract boolean attack();

// Void Method
    public void receiveDamage(Character karakter){
        if(karakter.attack > this.defense){
            this.HP = this.HP - (karakter.attack - this.defense);
            System.out.println(karakter.getClass().getSimpleName()+" Attack : Succeed ( "+this.getClass().getSimpleName()+" Receive "+(karakter.attack - this.defense)+" )");
            if(this.HP <= 0) {
                this.HP = 0;
            }
        }
    }

// Void Method
    public void info(){
        System.out.println("----------- STATUS -----------");
        System.out.println("Role\t: "+this.getClass().getSimpleName());
        System.out.println("HP\t: "+this.HP);
        System.out.println("Attack\t: "+this.attack);
        System.out.println("Defense\t: "+this.defense);
    }



}