package Loops;

public class BeginnerReduceButGrow {
    public static int grow(int[] x) {
        int res = 1;
        for (int num : x) {
            res *= num;
        }
        return res;
    }
}
