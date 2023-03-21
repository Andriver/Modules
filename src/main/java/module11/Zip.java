package module11;
import java.util.Iterator;
import java.util.stream.Stream;

public class Zip {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> secondIterator = second.iterator();
        return first.flatMap(e -> secondIterator.hasNext() ? Stream.of(e, secondIterator.next()) : Stream.empty())
                .map(e -> (T) e);
    }
}