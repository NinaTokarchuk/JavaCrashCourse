package Basic;

public class ThinkfulNumberDrillsPixelartPlanning {
    public static void main(String[] args) {
        System.out.println(isDivisible(2_000_000, 12345));
    }
    public static boolean isDivisible(int wallLength, int pixelSize) {
        return wallLength % pixelSize == 0;
    }
}
