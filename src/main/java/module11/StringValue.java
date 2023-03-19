package module11;
import java.util.ArrayList;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class StringValue {
    public  static String makeStringFromArray(ArrayList<String> list){
        return Stream.of(list.toString().replaceAll("[\\[\\]]", " ").strip().split(", "))
                .sorted()
                .collect(joining(", ","\"","\""));
    }
}