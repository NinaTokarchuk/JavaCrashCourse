package Basic;

public class CenturyFromYear {
    public static void main(String[] args) {
        System.out.println(century(150));
    }
    public static int century(int number) {
        int result = number / 100;
        if(number % 100 > 0)
            result += 1;
        return result;
    }
}
