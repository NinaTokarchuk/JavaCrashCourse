package Loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyHeadIsAtTheWrongEnd {
    public static String[] fixTheMeerkat(String[] arr) {
        String[] res = new String[3];
        res[0] = arr[2];
        res[1] = arr[1];
        res[2] = arr[0];
        return res;
    }
}
