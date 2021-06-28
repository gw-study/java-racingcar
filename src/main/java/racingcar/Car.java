package racingcar;

public class Car {
    private static final int FOUR = 4;
    private final Name name;
    private int currentPosition = 0;

    public Car(String name, int position) {
        this.name = new Name(name);
        this.currentPosition = position;
    }

    public int moveForward(int value){
        if(value >= FOUR) {
            currentPosition++;
        }
        return currentPosition;
    }

    public String getName() {
        return name.name();
    }
    public int getPosition() {
        return currentPosition;
    }

    public int maxPosition(int lastPosition){
        return Math.max(currentPosition, lastPosition);
    }

    public String showTrack(char trackShape) {
        StringBuffer track = new StringBuffer();

        for(int i=0; i< currentPosition; i++) {
            track.append(trackShape);
        }
        return track.toString();
    }
}
