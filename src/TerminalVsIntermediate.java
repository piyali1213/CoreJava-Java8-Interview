import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalVsIntermediate {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(12, 45, 78, 34, 90);
        List<Integer> result= list.stream()// convert list to stream
                .filter(a ->a%2==0) // intermediate operation
                .peek(System.out::println). // debugging
                map(a->a+a).//intermediate operation
                peek(System.out::println).
                filter(a->a>50) // intermediate operation
                .collect(Collectors.toList()); // terminal operation

        result.stream().forEach(System.out::println); // print // method reference
        // peek we use for debugging of filter and map

    }
}
