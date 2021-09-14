package String;

public class AlternatingCase {
    public static String toAlternativeString(String string) {
        StringBuilder sb = new StringBuilder(string);
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isUpperCase(sb.charAt(i)))
                sb.setCharAt(i, (char) (sb.charAt(i) + 32));
            else if (Character.isLowerCase(sb.charAt(i)))
                sb.setCharAt(i, (char) (sb.charAt(i) - 32));
        }
        return sb.toString();
    }
}
