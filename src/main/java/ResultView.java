import java.util.List;
import java.util.stream.Collectors;

public class ResultView {
    private final static String textOfResult = "결과보기";
    private final static String suffixOfText = "가 최종 우승했습니다.";

    public void showPositions(List<Car> cars) {
        for (Car car : cars) {
            printDistance(car);
        }
        System.out.println();
    }

    public void printDistance(Car car) {
        System.out.print(car.getName() + ": ");
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public void showResultsMessage() {
        System.out.println(textOfResult);
    }

    public void showWinner(List<Car> winners) {
        String alertOfWinner = winners.stream()
                .map(Car::getName)
                .collect(Collectors.joining(", "));

        alertOfWinner += suffixOfText;

        System.out.println(alertOfWinner);
    }
}