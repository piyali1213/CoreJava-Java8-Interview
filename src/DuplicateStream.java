import java.util.*;
import java.util.stream.Collectors;

public class DuplicateStream {
    public static void main(String[] args) {

       // duplicate with employee class



       // duplicate and unique with numbers.
        List<Integer> list=  Arrays.asList(12,34,12,56,77,11,11);
        Set<Integer> uniqueSet= new HashSet<>();
       Set<Integer> duplicate= list.stream().filter(x->!uniqueSet.add(x)).collect(Collectors.toSet());
       // list.stream().forEach(x-> System.out.println(x));// print the whole list
        System.out.println(uniqueSet);
        System.out.println(duplicate);





        //list.stream().forEach(x-> System.out.println(x));


    }
}
