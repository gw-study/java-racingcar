import java.util.List;
import java.util.stream.Collectors;

public class ResultView {
    private final static String textOfResult = "결과보기";
    private final static String suffixOfText = "가 최종 우승했습니다.";
    private List<Car[]> histories;
    private List<Car> winners;

    public ResultView(List<Car[]> histories, List<Car> winners) {
        System.out.println();
        System.out.println(textOfResult);
        this.histories = histories;
        this.winners = winners;
    }

    public void showDistance() {
        int historySize = histories.size();

        for (int i = 0; i < historySize; i++) {
            for (Car car : histories.get(i)) {
                System.out.println(car.getName() + ": " + car.getPositionString());
            }
            System.out.println();
        }
    }

    public void showWinner() {
        String alertOfWinner = winners.stream().map(Car::getName).collect(Collectors.joining(", "));
        alertOfWinner += suffixOfText;

        System.out.println(alertOfWinner);
    }
}