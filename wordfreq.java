import java.util.*;
import java.util.stream.*;

public class wordfreq {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Long> freq = lst.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(freq);
    }
}