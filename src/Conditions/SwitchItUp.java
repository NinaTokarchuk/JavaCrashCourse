package Conditions;

public class SwitchItUp {
    public static String switchItUp(int number) {
        String res;
        switch (number) {
            case 0:
                res = "Zero";
                break;
            case 1:
                res = "One";
                break;
            case 2:
                res = "Two";
                break;
            case 3:
                res = "Three";
                break;
            case 4:
                res = "Four";
                break;
            case 5:
                res = "Five";
                break;
            case 6:
                res = "Six";
                break;
            case 7:
                res = "Seven";
                break;
            case 8:
                res = "Eight";
                break;
            case 9:
                res = "Nine";
                break;
            default:
                res = "";
        }
        return res;
    }
}
