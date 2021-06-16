import java.util.Arrays;

public class ResultView {
    void printCar(String[] carArray) {
        System.out.println();
        Arrays.stream(carArray).forEach(System.out::println);
    }
}
