package java8.main;

import java8.person.Person;
import java8.stream.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Aphex on 25.05.2016.
 */
public class Runner {
    public static void execute() {
        List<Person> selection = SelectionAsListGetter.getSelection();
        System.out.println("Initial selection:");
        StreamPrinter.printPersons(selection.stream());
        System.out.println("Average age:");
        System.out.println(AverageAgeGetter.getAverageAge(selection.stream()));
        selection = StreamSorter.sortStreamByAge(selection.stream()).collect(Collectors.toList());
        System.out.println("Sorted selection:");
        StreamPrinter.printPersons(selection.stream());
        System.out.println("People with an equal names:");
        System.out.println(NameCounter.countNames(selection.stream()));
        selection = StreamMapper.transformStream(selection.stream(), AgeSubstractor.substractAge).collect(Collectors.toList());
        System.out.printf("Subtracted %d years from female persons\n", AgeSubstractor.getSubstractedAge());
        StreamPrinter.printPersons(selection.stream());
        System.out.println("Underage persons removed");
        StreamPrinter.printPersons(UnderageRemover.removeUnderages(selection.stream()));
    }
}
