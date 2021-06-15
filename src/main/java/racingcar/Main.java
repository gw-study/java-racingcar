package racingcar;

public class Main {
    public static void main(String[] args) {

        InputView inputView = new InputView();
        inputView.getEventInfo();

        Racing racing = new Racing();
        racing.readyCar(inputView.getCarCount());
        racing.startRace(inputView.getTryCount());
    }
}
