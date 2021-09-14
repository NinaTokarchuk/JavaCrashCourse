package String;

public class TripleTrouble {
    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            res.append(one.charAt(i));
            res.append(two.charAt(i));
            res.append(three.charAt(i));
        }
        return res.toString();
    }
}
