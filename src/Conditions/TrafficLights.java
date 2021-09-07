package Conditions;

public class TrafficLights {
    public static String updateLight(String current) {
        String res;
        switch (current) {
            case "green":
                res = "yellow";
                break;
            case "yellow":
                res = "red";
                break;
            case "red":
                res = "green";
                break;
            default:
                res = null;
        }
        return res;
    }
}
