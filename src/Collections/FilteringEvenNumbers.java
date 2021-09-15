package Collections;

import java.util.List;
import java.util.stream.Collectors;

public class FilteringEvenNumbers {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        return listOfNumbers.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
    }
}
