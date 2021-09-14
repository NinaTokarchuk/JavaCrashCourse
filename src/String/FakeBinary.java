package String;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        numberString = numberString.replaceAll("[0-4]", "0");
        numberString = numberString.replaceAll("[5-9]", "1");
        return numberString;
    }

    public static void main(String[] args) {
        String str = "45385593107843568";
        System.out.println(fakeBin(str));
    }
}
