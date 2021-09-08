package Loops;

public class TwiceAsOld {
    public static int TwiceAsOld(int dadYears, int sonYears) {
        return dadYears - sonYears * 2 > 0 ? dadYears - sonYears * 2 : sonYears * 2 - dadYears;
    }
}
