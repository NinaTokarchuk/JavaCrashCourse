package String;

import com.sun.deploy.util.StringUtils;

public class AllStarCodeChallenge {
    public static int strCount(String str, char letter) {
        return str.length() - str.replace(Character.toString(letter), "").length();
    }
}
