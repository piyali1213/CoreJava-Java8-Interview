package Wipro;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Print100 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>(101);
        for(int i=0;i<101;i++)
        { numbers.add(i);
            System.out.println(numbers.get(i));
        }
        numbers.stream().filter(e->e%2==0).map(e->e*e).forEach(e-> System.out.println(e));



        }

        }


