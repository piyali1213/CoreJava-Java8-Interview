package collections;

import java.util.HashSet;
import java.util.Set;
//...........HashSet traverse.........//
public class SetTraverse {
    public static void main(String[] args) {

        Set<String> books = new HashSet<>();
        books.add("JavaSql");
        books.add("SpringBoot");
        books.add("kafka");
        books.add("java8");

        books.forEach(x-> System.out.println(x));
        System.out.println("...............");

        for (String a:books)
        {
            System.out.println(a);
        }

        System.out.println("................");

        books.forEach(System.out::println);



    }
}
