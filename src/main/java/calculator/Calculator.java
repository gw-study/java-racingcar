package calculator;

public class Calculator {

    public boolean isBlank(String input) {
        return input.equals(" ") || input == null;
    }
    public String[] splitBlank(String str){
        return str.split(" ");
    }

    public int getResult(String input){
        if(isBlank(input))
            throw new IllegalArgumentException();
        return splitedNumCalculate(splitBlank(input));
    }
    public int splitedNumCalculate(String[] str) {
        int result = Integer.parseInt(str[0]);
        for(int i = 0; i < str.length - 2; i += 2) {
            result = calculate(result, Integer.parseInt(str[i + 2]), str[i + 1]);
        }
        return result;
    }
    public int calculate(int firstNum, int secondNum, String operator){
        return Operator.calculate(operator, firstNum, secondNum);
    }
}
