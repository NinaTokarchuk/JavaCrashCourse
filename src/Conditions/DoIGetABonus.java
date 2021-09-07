package Conditions;

public class DoIGetABonus {
    public static String bonusTime(final int salary, final boolean bonus) {
        return "\u00A3" + ( bonus ? String.valueOf(salary * 10) : String.valueOf(salary));
    }
}
