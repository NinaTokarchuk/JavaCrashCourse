package Loops;

public class FindNearestSquareNumber {
    public static int nearestSq(final int n) {
        int sqrtCeil = (int) Math.ceil(Math.sqrt(n));
        int sqrtFloor = (int) Math.floor(Math.sqrt(n));
        if (sqrtCeil * sqrtCeil - n < n - sqrtFloor * sqrtFloor)
            return sqrtCeil * sqrtCeil;
        return sqrtFloor * sqrtFloor;

    }
}
