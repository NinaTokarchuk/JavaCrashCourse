package Conditions;

public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        String res = "";
        if (birth > yearTo) {
            res = String.format("You will be born in %d year", birth - yearTo);
            if ((birth - yearTo) != 1)
                res += "s";
            res += ".";
        } else if (yearTo > birth) {
            res = String.format("You are %d year", yearTo - birth);
            if ((yearTo - birth) != 1)
                res += "s";
            res += " old.";
        } else return "You were born this very year!";
        return res;
    }
}
