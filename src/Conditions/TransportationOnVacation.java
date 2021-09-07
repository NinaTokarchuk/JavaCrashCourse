package Conditions;

public class TransportationOnVacation {
    public static int rentalCarCost(int d) {
        return d < 3 ? 40 * d : d < 7 ? 40 * d - 20 : 40 * d - 50;
    }
}
