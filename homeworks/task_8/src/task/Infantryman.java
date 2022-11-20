package task;

public class Infantryman extends BattleUnitBase {
    //     принимающий в качестве параметров имя, макс. здоровье, базо-
//         *         вую силу, макс. броню. Перенаправляет параметры в базовый
//         *         конструктор
    public Infantryman(String name, int maxHealth, int baseStrength, int maxArmor) {
        super(name, maxHealth, baseStrength, maxArmor);
    }

    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam) {
    }

    public void attack(BattleUnit other) {
//        равные половине силы,
//         *              и повреждения по броне равные четверти силы, иначе
//         *              наносит повреждения здоровью, равные силе.
//         *   Дополнительно:
//         *       - минимальные повреждения любого типа - 1
        double twoAttack = (this.strength / 2);
        double fourAttack = (this.strength / 4);
        if (twoAttack < 1) {
            this.strength = 1;
        }
        if (fourAttack < 1) {
            this.strength = 1;
        }
        if (other.armor() > 0) {
            other.takeDamage((int) twoAttack);
            other.damageArmor((int) fourAttack);
        } else {
            other.takeDamage(this.strength());
        }
    }
}

