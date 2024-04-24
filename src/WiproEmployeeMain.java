import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class WiproEmployeeMain {

    public static void main(String[] args) {
            List<Employee> list= new ArrayList<>();
//        List c1 = new ArrayList<>("toronto", "kolkata");
//        List c2= new ArrayList<>("usa", "kolkata");
//        List c3= new ArrayList<>("toronto", "delhi");
//        List c4= new ArrayList<>("pune", "kolkata");

            list.add(new Employee(101, "piyali",23, List.of("toronto","kolkta")));
            list.add(new Employee(103, "ali",53, List.of("oakvile","milton")));
            list.add(new Employee(102, "piya",53,List.of("mississauga","kolkta")));
            list.add(new Employee(109, "li",93,List.of("toronto","Delhi")));

            list.stream().map(e->{return e.getCities();}).collect(Collectors.toList())
                    .forEach(e-> System.out.println(e));







//            Set<Employee> uniqueSet = new HashSet<>();
//             list.stream().map(e->{e.getCities();}).filter(e->!uniqueSet.add(e)).collect(Collectors.toSet());
//        System.out.println(uniqueSet);
//


//      List<Employee> result = list.stream()
//              .filter(e-> {return e.getCities();}).forEach(x-> System.out.println(x));
//               // .collect(Collectors.toList());
            // result.forEach(System.out::println);


//        for (Employee employee : result) {
//            System.out.println(employee);
        }


    }

