package java8.stream;

import java8.person.Person;


import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Aphex on 25.05.2016.
 */
public class NameCounter {
    public static Map<String, Long> countNames(Stream<Person> stream) {
        Map<String, Long> collect = stream.collect(Collectors.groupingBy(
                person -> person.getName(), Collectors.counting()
        ));
        return collect;
    }
}

