import java.util.Arrays;

public class ResultView {
    void printCar(String[] carArray) {
        Arrays.stream(carArray).forEach(System.out::println);
    }
}
