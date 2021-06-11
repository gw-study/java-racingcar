import java.util.Scanner;

class InputView {
    private static String QUESTION_ABOUT_NUMBER_OF_CARS = "자동차 대수는 몇 대 인가요?";
    private static String QUESTION_ABOUT_NUMBER_OF_TIMES = "시도할 회수는 몇 회 인가요?";
    private Scanner sc = new Scanner(System.in);
    
    public int inputNumberOfCar() {
        System.out.println(QUESTION_ABOUT_NUMBER_OF_CARS);
        return isValidInput(sc.nextLine());
    }

    public int inputNumberOfTimes() {
        System.out.println(QUESTION_ABOUT_NUMBER_OF_TIMES);
        return isValidInput(sc.nextLine());
    }

    public int isValidInput(String input) throws NullPointerException {
        String regex = "^[0-9]+$";

        if (!input.matches(regex)) {
            throw new NullPointerException();
        }

        return Integer.parseInt(input);
    }
}