package task;

public class Alchemist extends BattleUnitBase{
    public Alchemist(String name, int maxHealth, int baseStrength, int maxArmor){
        super (name,maxHealth, baseStrength, maxArmor);
    }
    public void specialAbility(BattleUnit[] ownTeam, BattleUnit[] enemyTeam){
        int minHealth = Integer.MAX_VALUE;
        int maxHealth = Integer.MIN_VALUE;
        int minHealthIndex = 0;
        int maxHealthIndex = 0;
//     максимальое здоровье ->+1
        // минимальное +10
        for (int i = 0; i < ownTeam.length; i++) {
            BattleUnit own = ownTeam[i];
            int ownHealth = own.health();

            if (ownHealth > maxHealth){
                maxHealthIndex = i;
            }

            if (ownHealth < minHealth){
                minHealth = ownTeam[i].health();
                minHealthIndex = i;
            } }
            ownTeam[minHealthIndex].heal(10);
            ownTeam[maxHealthIndex].setStrength(ownTeam[maxHealthIndex].strength()+1);}
            public void attack(BattleUnit other) {
                other.setStrength(other.strength() - 2);
                other.setMaxHealth(other.maxHealth() - 4);
            }


}
