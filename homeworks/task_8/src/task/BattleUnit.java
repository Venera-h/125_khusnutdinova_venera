package task;


public interface BattleUnit {
    public String name();
    public int health();
    public int maxHealth();
    public void setMaxHealth(int value);
    public void heal(int value);
    public void takeDamage(int value);
    public int strength();
    public void setStrength(int value);
    public int baseStrength();
    public int armor();
    public void restoreArmor(int value);
    public void damageArmor(int value);
    public int maxArmor();
    public void setMaxArmor(int value);
    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam);
    public void attack(BattleUnit other);
}
