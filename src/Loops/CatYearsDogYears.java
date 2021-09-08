package Loops;

public class CatYearsDogYears {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int[] res = new int[3];
        res[0] = humanYears;
        res[1] = 15;
        res[2] = 15;
        if (humanYears >= 2) {
            res[1] += 9;
            res[2] += 9;
            for (int i = 2; i < humanYears; i++) {
                res[1] += 4;
                res[2] += 5;
            }
        }
        return res;
    }
}
