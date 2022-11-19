package task;

public abstract class BattleUnitBase implements BattleUnit{
//     String name, maxHealth, baseStrength, maxArmor
    public BattleUnitBase(String name, int maxHealth, int baseStrength, int maxArmor) {

        this.name = name;
        this.maxHealth = maxHealth;
        this.baseStrength = baseStrength;
        this.maxArmor = maxArmor;
    }

    @Override
    public String name() {
        return this.name();
    }
    public int maxHealth() {
        return this.maxHealth;
    }
    public int baseStrength() {
        return this.baseStrength;
    }
    public int maxArmor() {
        return this.maxArmor;
    }


}

    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam);
    public void attack(BattleUnit other);
}
