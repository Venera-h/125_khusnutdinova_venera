package task;

public class ArmorDestroyer extends BattleUnitBase {
    public ArmorDestroyer(String name, int maxHealth, int baseStrength, int maxArmor){
        super (name,maxHealth, baseStrength, maxArmor);
    }
//     - выбирает живого противника с максимальной броней.
//            *          Если противник в броне, наносит урон броне, равный удвоенной силе.
//            *          Иначе наносит урон здоровью, равный четверти силы.
    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam) {
        int maxenemyArmor = Integer.MIN_VALUE, index=0;//макс броня

        for (int i = 0; i < enemyTeam.length; i++) {
            BattleUnit enemy = enemyTeam[i];
            int enemyArmor = enemy.armor();
            int enemyHealth = enemy.health();
            if (enemyTeam[i].health() <= 0){
                continue;
            }

            if (enemyArmor > maxenemyArmor) {
                maxenemyArmor = enemyArmor;
                index = i;
            }
        }
        final BattleUnit enemy = enemyTeam[index];

        if (enemy.armor() > 0) {
            enemy.damageArmor(2 * this.strength());//аттакуем 2 раза
        }
        else {
            enemy.takeDamage(Math.max(this.strength() / 4, 1)); // четвертинка
        }
    }
//    если противник в броне,
//         *              наносит повреждения по здоровью, равные четверти силы,
//         *              и повреждения по броне равные силе, иначе
//         *              наносит повреждения здоровью, равные половине силы.
    @Override
    public void attack(BattleUnit other) {
        if (other.armor() > 0) {
            other.takeDamage(Math.max(this.strength() / 4, 1) );
            other.damageArmor(this.strength() );
        } else
            other.takeDamage(Math.max(this.strength() / 2, 1) );
    }
}

