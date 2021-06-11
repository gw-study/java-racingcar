import java.util.Scanner;

class InputView {
    private static String QUESTION_ABOUT_NUMBER_OF_CARS = "자동차 대수는 몇 대 인가요?";
    private static String QUESTION_ABOUT_NUMBER_OF_TIMES = "시도할 회수는 몇 회 인가요?";

    public int inputNumberOfCar() {
        System.out.println(QUESTION_ABOUT_NUMBER_OF_CARS);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public int inputNumberOfTimes() {
        System.out.println(QUESTION_ABOUT_NUMBER_OF_TIMES);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}