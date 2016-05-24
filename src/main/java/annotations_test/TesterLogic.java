package annotations_test;

import annotations.Injector;

/**
 * Created by Aphex on 24.05.2016.
 */
public class TesterLogic {
    public static void execute(){
        HeirOfConsumer heirOfConsumer = new HeirOfConsumer();
        System.out.println("Injecting caches to fields:");
        Injector.injectTo(heirOfConsumer);
        System.out.println("Putting strings in caches");
        heirOfConsumer.putInCache(1,"This is MapCache\n");
        System.out.println("Strings putted in MapCache successfully");
        heirOfConsumer.putInSortedCache(1, "This is SortedMapCache\n");
        System.out.println("Strings putted in SortedMapCache successfully\n" +
                "Containing strings:\n");
        System.out.print("In MapCache:\n"+heirOfConsumer.getFromCache(1)+
                "In SortedMapCache:\n"+heirOfConsumer.getFromSortedCache(1));

    }
}
