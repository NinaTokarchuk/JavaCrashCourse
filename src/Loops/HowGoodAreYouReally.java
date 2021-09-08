package Loops;

public class HowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int mark : classPoints) {
            sum += mark;
        }
        return yourPoints > ((sum + yourPoints) / (classPoints.length + 1));
    }
}
