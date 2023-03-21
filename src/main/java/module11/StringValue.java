package module11;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class StringValue {
    public static String makeStringFromArray(ArrayList<String> list) {
        StringBuilder sb = new StringBuilder();
        Comparator<Integer> comp = (a, b) -> a - b;
        list.stream()
                .flatMap(s -> Stream.of(s.split(", ")))
                .map(Integer::parseInt)
                .sorted(comp)
                .forEach(i -> sb.append(i).append(", "));
        sb.setLength(sb.length() - 2); // remove last comma and space
        return sb.toString();
    }
}