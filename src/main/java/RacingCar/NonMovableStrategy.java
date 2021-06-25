package RacingCar;

public class NonMovableStrategy implements MoveStrategy {
    @Override
    public boolean isMove() {
        return false;
    }
}
