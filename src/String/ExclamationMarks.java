package String;

public class ExclamationMarks {
    public static String remove(String s, int n) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < n; i++) {
            if (sb.indexOf("!") == -1)
                return sb.toString();
            sb.replace(sb.indexOf("!"), sb.indexOf("!") + 1, "");
        }
        return sb.toString();
    }
}
