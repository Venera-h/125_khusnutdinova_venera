package task;

public abstract class BattleUnitBase implements BattleUnit{
//     String name, maxHealth, baseStrength, maxArmor
    protected final String name;// больше не изменяем
    protected int maxHealth;
    protected int baseStrength;
    protected int maxArmor;
    protected int armor;
    protected int health;
    protected int strength;

    public BattleUnitBase(String name, int maxHealth, int baseStrength, int maxArmor) {
        this.name = name;
        this.maxHealth = this.health = maxHealth;
        this.baseStrength = this.strength = baseStrength;
        this.maxArmor = this.armor= maxArmor;
    }

    @Override
    public String name() {
        return this.name;
    }
    public int health() {
        return this.health;
    }
    public int maxHealth() {
        return this.maxHealth;
    }
    public void setMaxHealth(int maxHealth) {
        if (this.health > maxHealth) this.health = maxHealth;
        this.maxHealth = maxHealth;
    }
    public void heal(int value){
        this.health += value;
        if (this.health> maxHealth){
            this.health=maxHealth;
        }
    }
    public void takeDamage(int value){
        this.health -= value;
    }
    public int strength(){
        return this.strength;
    }
    public void setStrength(int value){
        this.strength=value;
    }
    public int baseStrength(){
        return this.baseStrength;
    }
    public int armor(){
        return this.armor;
    }
    public void restoreArmor(int value){
        this.armor +=value;
        if (this.armor>maxArmor){
            this.armor=maxArmor;
        }
    }
    public void damageArmor(int value){
        this.armor -= value;
        if (this.armor<0){ // броня не может уйти в минус
            this.armor =0;
        }
    }
    public int maxArmor() {
        return this.maxArmor;
    }
    public void setMaxArmor(int value) {
        this.maxArmor = value;
        if (this.armor > value) {
            this.armor = value;
        }
    }

 public abstract void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam);
 public abstract void attack(BattleUnit other);
}
