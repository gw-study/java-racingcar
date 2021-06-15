package racingcar;

public class Car {
    private int currentPosition = 0;
    static final Integer FOUR = 4;

    public int moveForward(int value){
        if(value >= FOUR) {
            currentPosition += value;
        }
        return currentPosition;
    }

    public String showTrack(char trackShape) {
        StringBuffer track = new StringBuffer();

        for(int i=0; i< currentPosition; i++) {
            track.append(trackShape);
        }
        return track.toString();
    }
}
