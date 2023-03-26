package module12;

import java.time.Duration;
import java.time.Instant;

public class AmountOfTime implements Runnable {
    private Instant startTime;

    public AmountOfTime() {
        startTime = Instant.now();
    }

    @Override
    public void run() {
        while (true) {
            Instant currentTime = Instant.now();
            Duration duration = Duration.between(startTime, currentTime);
            System.out.println("Прошло " + duration.getSeconds() + " секунд");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (duration.getSeconds() % 5 == 0) {
                System.out.println("Прошло 5 секунд");
            }
        }
    }
}
