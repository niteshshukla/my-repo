import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapOpr {

    public static void main(String[] args) {
         List<List<Employee>> emplist = new ArrayList<>();

         emplist.add(Arrays.asList(new Employee("Nitesh",10000),
                 new Employee("Shubbh", 20000),
                 new Employee("Arun",15000)));
        emplist.add(Arrays.asList(new Employee("ss",1000),
                new Employee("bb", 2000),
                new Employee("ns",150)));

        List<Employee> emp= emplist.stream().flatMap(list->list.stream()).collect(Collectors.toList());
        System.out.println(emplist);
        System.out.println("******************************");
        System.out.println(emp);
    }
}
