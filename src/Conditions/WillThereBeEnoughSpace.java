package Conditions;

public class WillThereBeEnoughSpace {
    public static int enough(int cap, int on, int wait) {
        return (cap - on) >= wait ? 0 : wait - (cap - on);
    }
}
