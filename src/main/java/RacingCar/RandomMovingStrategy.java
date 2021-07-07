package RacingCar;

import java.util.Random;

public class RandomMovingStrategy implements MoveStrategy {
    private static final int RANDOM_NUMBER_UPPER_BOUND = 10;
    private static final int MOVABLE_NUM = 4;

    @Override
    public boolean isMove() {
        return getRandomNumber() >= MOVABLE_NUM;
    }

    private int getRandomNumber() {
        return new Random().nextInt(RANDOM_NUMBER_UPPER_BOUND);
    }
}
