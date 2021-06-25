package RacingCar;

import java.util.Random;

public class RandomMove implements MoveStrategy {
    private static final int RANDOM_NUMBER_UPPER_BOUND = 10;

    @Override
    public boolean isMove() {
        if (new Random().nextInt(RANDOM_NUMBER_UPPER_BOUND) >= 4) {
            return true;
        }
        return false;
    }
}
