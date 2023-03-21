package module11;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Name {
    public static String namesWithUnpairedIndex(ArrayList<String> list) {
        return IntStream.range(0, list.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> i + ". " + list.get(i))
                .collect(Collectors.joining("\n"));
    }
}