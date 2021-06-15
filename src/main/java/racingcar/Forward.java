package racingcar;

import java.util.Random;

public class Forward {
    private Random random = new Random();

    static final Integer TEN = 10;

    public int moveForwardValue() {
        return random.nextInt(TEN);
    }
}
