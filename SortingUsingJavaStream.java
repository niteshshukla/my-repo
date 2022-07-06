import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingUsingJavaStream {

    static List<Employee> emplist = Arrays.asList(
            new Employee("Nitesh",10000),
            new Employee("Shubbh", 20000),
            new Employee("Arun",15000)
    );




    public static void main(String[] args) {

        //emplist.stream().sorted(Comparator.comparing(Employee::getSal).reversed()).forEach(e-> System.out.println(e));
        //emplist.stream().sorted(Comparator.comparing(Employee::getSal)).forEach(e-> System.out.println(e));
        Map<String,Integer> map = new HashMap<>();
        map.put("Arayn", 100000);
        map.put("Pupu",50000);
        map.put("Nitesh",80000);
        map.put("Shubbh", 90000);

        //if map contains primitive ket and value
       // map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        //map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

        Map<Employee,Integer> empmap = new HashMap<>();
        empmap.put(new Employee("Arayn", 100000),2);
        empmap.put(new Employee("Pupu",50000),3);
        empmap.put(new Employee("Nitesh",80000),1);
        empmap.put(new Employee("Shubbh", 90000),4);

        //if map contains non primitive values

        //empmap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSal))).forEach(System.out::println);
        //empmap.entrySet().stream().sorted(Map.Entry.comparingByValue()).limit(2).forEach(System.out::println);


        String s= "aa bbb ccc dd ff bbb e dddd dfdfdf vcvc dfdfd vcvc";

        String arr[]= s.split(" ");
        Map<String,Long> countMap= Stream.of(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Map.Entry<String, Long>> collect = countMap.entrySet()
                .stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(2).collect(Collectors.toList());

        System.out.println(collect);



    }
}
