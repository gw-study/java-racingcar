package racingcar;

public class Main {
    public static void main(String[] args) {

        InputView inputView = new InputView();
        inputView.inputCarRacingEvent();
        ResultView resultView = new ResultView();

        Racing racing = new Racing();
        racing.readyCar(inputView.getCarCount());
        resultView.startResult();
        for(int i = 0; i < inputView.getTryCount(); i++){
            resultView.showRacingCarResult(racing.moveCars());
        }
    }
}
