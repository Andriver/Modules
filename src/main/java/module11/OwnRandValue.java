package module11;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class OwnRandValue {
    public static final int c = 11;
    public static final long  a = 25214903917L;
    public static final long m = (long) Math.pow(2, 48);

    public  static List<Long> lineaCongruentGenerator(int c, long  a, long m){
        return Stream.iterate(0L, x -> ((a * x + c) % m))
                .limit(10)
                .collect(toList());
    }
}