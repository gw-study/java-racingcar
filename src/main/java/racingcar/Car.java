package racingcar;

public class Car {
    private int currentPosition;
    static final Integer FOUR = 4;

    public int moveForward(int value){
        if(value >= FOUR) {
            currentPosition++;
        }
        return currentPosition;
    }

    public int getCurrentPosition(){
        return currentPosition;
    }
}
