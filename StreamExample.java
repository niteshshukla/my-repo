import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<Student> list1= Arrays.asList(
                new Student("nitesh", 50,50),
                new Student("ss", 80,80),
                new Student("shukla",80,80)
        );

        Map<String, Integer> collect = list1.stream().collect(Collectors.toMap(s -> s.getName(), s -> (s.getMark2() + s.getMark1())/2));
        Optional<Map.Entry<String, Integer>> max = collect.entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println(max.get());
    }
}
