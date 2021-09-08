package Loops;

public class SumOfPositive {
    public static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num > 0) sum += num;
        }
        return sum;
    }

}
