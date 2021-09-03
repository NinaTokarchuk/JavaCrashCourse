package Classes;

public class Fighter {
    public String name;
    public int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String winner = "";
        int fighterIndex = (firstAttacker == fighter1.name) ? 0 : 1;//who attacks first
        while (fighter1.health > 0 && fighter2.health > 0) {
            if (fighterIndex % 2 == 0) {//the first fighter attacks
                fighter2.health -= fighter1.damagePerAttack;
                winner = fighter1.name;
            } else {//the second fighter attacks
                fighter1.health -= fighter2.damagePerAttack;
                winner = fighter2.name;
            }
            fighterIndex++;//change fighter
        }
        return winner;
    }

    public static void main(String[] args) {
        String res = declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew");
        System.out.println(res);
    }
}
