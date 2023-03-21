package module11;

import java.util.stream.Stream;

public class OwnRandValue {
    public static final int c = 11;
    public static final long a = 25214903917L;
    public static final long m = (long) Math.pow(2, 48);

    public static Stream<Long> lineaCongruentGenerator(int c, long a, long m) {
        return Stream.iterate(0L, x -> ((a * x + c) % m));
    }
}