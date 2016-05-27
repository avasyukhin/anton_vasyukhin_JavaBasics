package java8.person;

import java.util.Random;
import java.util.function.Supplier;

/**
 * Created by Aphex on 25.05.2016.
 */
public class PersonSupplier implements Supplier<Person> {
    public Person get() {
        Random generator = new Random();
        Names[] names = Names.values();
        Person.Gender[] genders = Person.Gender.values();

        int age = Person.getMinimalAge() + generator.nextInt(65);
        String name = names[generator.nextInt(names.length)].toString();
        Person.Gender gender = genders[generator.nextInt(genders.length)];

        return new Person(name, age, gender);
    }
}
