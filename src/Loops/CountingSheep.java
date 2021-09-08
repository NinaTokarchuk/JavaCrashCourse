package Loops;

public class CountingSheep {
    public int countSheep(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (Boolean sheep : arrayOfSheeps) {
            if (sheep != null)
                if (sheep) count++;
        }
        return count;
    }
}
