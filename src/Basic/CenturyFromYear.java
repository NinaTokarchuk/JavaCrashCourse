package Basic;

public class CenturyFromYear {
    public static void main(String[] args) {
        System.out.println(century(10001));
    }
    public static int century(int number) {
        int result = number / 100;
        if(number % 10 > 0)
            result += 1;
        return result;
    }
}
