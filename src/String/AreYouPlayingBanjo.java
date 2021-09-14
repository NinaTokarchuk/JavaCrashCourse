package String;

import java.util.Locale;

public class AreYouPlayingBanjo {
    public static String areYouPlayingBanjo(String name) {
        return name.toLowerCase().startsWith("r") ? name + " plays banjo" : name + " does not play banjo";
    }
}
