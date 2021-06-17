package racingcar;

import java.util.Random;

public class Forward {
    private Random random = new Random();

    private static final int TEN = 10;

    public int moveForwardValue() {
        return random.nextInt(TEN);
    }
}
