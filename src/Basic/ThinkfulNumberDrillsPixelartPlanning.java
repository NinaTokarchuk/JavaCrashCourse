package Basic;

public class ThinkfulNumberDrillsPixelartPlanning {
    public static void main(String[] args) {
        System.out.println(isDivisible(2_000_000, 0));
    }
    public static boolean isDivisible(int wallLength, int pixelSize) {
        return pixelSize == 0 ? false : wallLength % pixelSize == 0;
    }
}
