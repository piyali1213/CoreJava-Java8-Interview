import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {


        List<Student> list = new ArrayList<>();
        list.add(new Student(15,"piyali", List.of("tcs","cts","ibm")));
        list.add(new Student(16,"piya",List.of("tcs","wipro","td")));
        list.add(new Student(12,"ali",List.of("citi","td","bmo")));
        list.add(new Student(13,"mala",List.of("tcs","cibc","wipro")));
        list.add(new Student(11,"sham",List.of("infosys","td","cts")));
        list.stream().map(e->e.getName()).forEach(System.out::println); // print only name


        list.stream().map(e->e.getName()).collect(Collectors.toSet());
                list.stream().forEach(System.out::println); // print id,name,companies


        list.stream().filter(e->e.getId()%2==0).map(e->{return e.getCompanies();}).forEach(System.out::println); // only companies

        list.stream().forEach(e->System.out.println(e)); //print id,name,companies


        }

}

