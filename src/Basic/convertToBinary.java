package Basic;

public class convertToBinary {
    public static void main(String[] args) {
        System.out.println(toBinary(11));
    }
    public static int toBinary(int n) {
        // return Integer.parseInt(Integer.toBinaryString(n));
        // using built-in functions (parseInt returns primitive int,
        // valueOf is the same, but it returns Integer Object)
       String str = "";
        while(n != 1){
            str += (n - 2 *(n / 2));
            n /= 2;
        }
        str += (n - 2 *(n / 2));
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(str);
        strBuilder.reverse();
        n = Integer.parseInt(strBuilder.toString());
        return n;
    }
}
