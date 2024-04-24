package collections;

import java.util.Arrays;
import java.util.List;

//.....Traverse List.....//

public class ListTraverse {

    public static void main(String[] args) {
        List<Integer> a1 = Arrays.asList(3,6,4,8,7,9,2);
        traversList(a1);

    }
    public static void traversList(List<Integer> list) {
        list.forEach(x -> System.out.println(x)); // using loop

        System.out.println("...............");

        list.forEach(System.out::println); // using java8
    }




}
