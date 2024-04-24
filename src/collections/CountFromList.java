package collections;

import java.util.Arrays;
import java.util.List;

//import static sun.security.util.KnownOIDs.Data;

public class CountFromList {
    public static void main(String[] args) {

        List<Integer> a1 = Arrays.asList(3, 6, 7, 3, 5, 3, 1, 5);
        Checklist(a1, 3);
        //a1.stream().filter(x-> a1.equals(x)).count();
    }

    public static void Checklist(List<Integer> list, int data) {

        Long count = list.stream().filter(x -> x.equals(data)).count();
         //list.stream().filter(x -> x.equals(data)).count();

        System.out.println(count);

    }


}
