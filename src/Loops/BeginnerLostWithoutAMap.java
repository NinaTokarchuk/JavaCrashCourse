package Loops;

public class BeginnerLostWithoutAMap {
    public static int[] map(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i] * 2;
        }
        return res;
    }
}
