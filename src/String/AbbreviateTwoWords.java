package String;

import java.util.Locale;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String[] parts = name.toUpperCase().split(" ");
        return parts[0].charAt(0) + "." + parts[1].charAt(0);
    }
}
