package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiImplementation {
    public static void main(String[] args) {



//        Creating Stream API object
//        With Stream API Methods .

//        1. list.stream();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(0);
        list1.add(3);
        list1.add(2);

        Stream<Integer>  stream=list1.stream();

//        2. Stream.of();
        String[] names = {"hi", "hello","ok"};
        Stream<String> stringStream = Stream.of(names);

//        3. Arrays.stream()
        Integer [] num = {1, 2};
       Stream<Integer> integerStream = Arrays.stream(num);

//       4. Stream.builder().build();
        Stream<Object> objectStream = Stream.builder().build();

//       5. Stream.empty();
        Stream<Object> objectStream1 = Stream.empty();


//        Important methods we use in Stream APIs.

//        stream.filter(), takes Predicate as an argument, boolean.
//        Used to filter the data based  on the condition. If true collects the data else skips.
         list1 = stream.filter(integer -> integer > 1).collect(Collectors.toList());
        System.out.println(list1);

//        stream.map(),  takes Function<Input Type, Return Type>.
//        Used to transform data from one form to other without effecting the original Stream.
        stringStream.map(String::toUpperCase).forEach(e -> System.out.println(e));

//        stream.forEach(),  takes  Consumer<T>


    }
}
