package task;

public class ArmorDestroyer extends BattleUnitBase {
    public ArmorDestroyer(String name, int maxHealth, int baseStrength, int maxArmor){
        super (name,maxHealth, baseStrength, maxArmor);
    }
    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam) {
        int maxenemyArmor = Integer.MIN_VALUE;
        int maxenemyArmorIndex=0;

        for (int i = 0; i < enemyTeam.length; i++) {
            BattleUnit enemy = enemyTeam[i];
            int enemyArmor = enemy.armor();
            int enemyHealth = enemy.health();

            if (enemyArmor > maxenemyArmor) {
                maxenemyArmor = enemyArmor;
                maxenemyArmor = i;
            }
        }
        final BattleUnit enemy = enemyTeam[maxenemyArmor];

        if (enemy.armor() > 0) {
            enemy.damageArmor(2 * this.strength() );
        }
        else {
            enemy.takeDamage(Math.max(this.strength() / 4, 1));
        }
    }

    @Override
    public void attack(BattleUnit other) {
        if (other.armor() > 0) {
            other.takeDamage(Math.max(this.strength() / 4, 1) );
            other.damageArmor(this.strength() );
        } else
            other.takeDamage(Math.max(this.strength() / 2, 1) );
    }
}

