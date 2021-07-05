import java.util.List;
import java.util.stream.Collectors;

public class ResultView {
    private final static String textOfResult = "결과보기";
    private final static String suffixOfText = "가 최종 우승했습니다.";

    public List<List<Car>> histories;

    public ResultView(List<List<Car>> histories){
        this.histories = histories;
    }

    public void getHistories() {
        for (List<Car> car: histories) {
            showPositions(car);
        }
    }

    public void showPositions(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + ": " + car.getPositionString());
        }
        System.out.println();
    }

    public void showResultsMessage() {
        System.out.println(textOfResult);
    }

    public void showWinner(List<Car> winners) {
        String alertOfWinner = winners.stream().map(Car::getName).collect(Collectors.joining(", "));
        alertOfWinner += suffixOfText;

        System.out.println(alertOfWinner);
    }
}