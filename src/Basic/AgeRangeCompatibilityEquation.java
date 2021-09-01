package Basic;

public class AgeRangeCompatibilityEquation {
    public static void main(String[] args) {
        System.out.println(datingRange(17));
    }
    public static String datingRange(int age) {
        int min;
        int max;
        if(age <= 14) {
            min = (int)(age - 0.10 * age);
            max = (int)(age + 0.10 * age);
        }
        else {
            min = (int)(age / 2) + 7;
            max = 2 * (age - 7);
        }
        return min + "-" + max;
    }
}
