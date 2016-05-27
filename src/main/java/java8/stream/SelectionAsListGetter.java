package java8.stream;

import java8.person.Person;
import java8.person.PersonSupplier;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Aphex on 25.05.2016.
 */
public class SelectionAsListGetter {
    public static List<Person> getSelection() {
        final int SELECTION_SIZE = 15;
        List<Person> personList = Stream
                .generate(new PersonSupplier())
                .limit(SELECTION_SIZE)
                .collect(Collectors.toList());
        return personList;
    }
}
