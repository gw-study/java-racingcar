import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringCalculator calculator = new StringCalculator();
        String[] array = calculator.enterCommand(str);

        String result = array[0];

        for(int i = 0; i < array.length - 2; i+=2) {
            String operator = array[i+1];
            String num2 = array[i+2];

            result = calculator.calculate(result, operator, num2);
        }

        System.out.println(result);
    }
}
