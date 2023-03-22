package module11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringValue {
    public static String makeStringFromArray(ArrayList<String> list) {
        return Arrays.stream(list.toArray(new String[0]))
                .flatMap(s -> Arrays.stream(s.split(",\\s*")))
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }
}
