package module11;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static module11.OwnRandValue.*;

public class TestModule11 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Boris");
        list.add("Denis");
        list.add("Ivan");
        list.add("Viktor");
        list.add("Artem");
        list.add("Vlad");
        System.out.println(Name.namesWithUnpairedIndex(list));
        System.out.println();

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Boris");
        list1.add("Denis");
        list1.add("Ivan");
        list1.add("Viktor");
        list1.add("Artem");
        list1.add("Vlad");
        System.out.println(list1);
        System.out.println(SortName.namesReversedSort(list1));
        System.out.println();

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("6, 7, 8");
        list3.add("3, 4, 5");
        list3.add("0, 1, 2, -1");
        System.out.println(list3);
        System.out.println(StringValue.makeStringFromArray(list3));
        System.out.println();

        //System.out.println(OwnRandValue.lineaCongruentGenerator(c, a, m));

        OwnRandValue.lineaCongruentGenerator(c, a, m)
                .limit(10)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();


        Stream<Integer> first = Stream.of(1, 2, 3, 4);
        Stream<Integer> second = Stream.of(5, 6, 7);
        Stream<Integer> zipped = Zip.zip(first, second);
        zipped.forEach(System.out::println); // Output: 1 5 2 6 3 7
    }
}