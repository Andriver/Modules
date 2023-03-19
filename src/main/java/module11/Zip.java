package module11;
import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class Zip {
    public static <T> List<T> zip(Stream<T> first, Stream<T> second) {
        Spliterator<T> splitFirst = first.spliterator();
        Spliterator<T> splitSecond = second.spliterator();
        List<T> list = new ArrayList<>();
        while (splitFirst.tryAdvance(list::add) && splitSecond.tryAdvance(list::add)) ;
        return list;
    }
}