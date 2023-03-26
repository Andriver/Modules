package module12;

public class TestAmountOfTime {
    public static void main(String[] args) {
        Thread thread = new Thread(new AmountOfTime());
        thread.start();
    }
}
