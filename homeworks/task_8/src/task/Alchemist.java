//package task;
//
//public class Alchemist extends BattleUnitBase{
//    public Alchemist(String name, int maxHealth, int baseStrength, int maxArmor){
//        super (name,maxHealth, baseStrength, maxArmor);
//    }
//    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam){
////        int minHealth = Integer.MAX_VALUE;
////        int maxHealth = Integer.MIN_VALUE;
////        int minHealthIndex = 0;
////        int maxHealthIndex = 0;
//        int minHealth = Integer.MAX_VALUE, index1 = 0;
//        int maxHealth = Integer.MIN_VALUE, index2 = 0;
////     максимальое здоровье ->+1
//        // минимальное +10
//        for (int i = 0; i < ownTeam.length; i++) {
//            BattleUnit own = ownTeam[i];
//            int ownHealth = own.health();
//            if (ownTeam[i].health() <= 0) continue;
//
//            if (ownHealth > maxHealth){
//                index1 = i;
//            }
//
//            if (ownHealth < minHealth){
//                minHealth = ownTeam[i].health();
//                index2 = i;
//            } }
//            ownTeam[index1].heal(10);
//            ownTeam[index2].setStrength(ownTeam[index1].strength()+1);}
//            public void attack(BattleUnit other) {
//                other.setStrength(other.strength() - 2);
//                other.setMaxHealth(other.maxHealth() - 4);
//            }
//
//
//}
package task;

public class Alchemist extends BattleUnitBase {
    public Alchemist(String unitName, int maxHealth, int baseStrength, int maxArmor) {
        super(unitName, maxHealth, baseStrength, maxArmor);
    }

    @Override
    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam) {
        int minHealth = Integer.MAX_VALUE, index1 = 0;
        int maxHealth = Integer.MIN_VALUE, index2 = 0;

        for (int i = 0; i < ownTeam.length; i++) {
            if (ownTeam[i].health() <= 0) continue;

            final int teammateHealth = ownTeam[i].health();

            if (teammateHealth < minHealth) {
                minHealth = teammateHealth;
                index1 = i;
            }

            if (teammateHealth > maxHealth) {
                maxHealth = teammateHealth;
                index2 = i;
            }
        }

        final BattleUnit teammateLowHealth = ownTeam[index1];
        final BattleUnit teammateHighHealth = ownTeam[index2];

        teammateLowHealth.heal(10);
        teammateHighHealth.setStrength(teammateHighHealth.strength() + 1);
    }
    @Override
    public void attack(BattleUnit other) {
        other.setStrength(other.strength() - 2);// уменьшает показатель силы на 2
        other.setMaxHealth(other.maxHealth() - 4);// уменьшает показатель здоровья на 4
    }
}
