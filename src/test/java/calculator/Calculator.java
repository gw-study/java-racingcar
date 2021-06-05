package calculator;

public class Calculator {
    public boolean isBlank(String input) {
        if(input.equals(" ") || input == null)
            return true;
        return false;
    }
    public String[] splitBlank(String str){
        return str.split(" ");
    }
    public int calculate(int firstNum, int secondNum, char operator){
        if(operator == '+')
            return add(firstNum, secondNum);
        if(operator == '-')
            return subtract(firstNum, secondNum);
        if(operator == '*')
            return multiply(firstNum, secondNum);
        if(operator == '/')
            return divide(firstNum, secondNum);
        throw new IllegalArgumentException();
    }
    public int add(int firstNum, int secondNum){
        return firstNum + secondNum;
    }
    public int subtract(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }
    public int multiply(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }
    public int divide(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }
    public int getResult(String input){
        if(isBlank(input))
            throw new IllegalArgumentException();
        return splitedNumCalculate(splitBlank(input));
    }
    public int splitedNumCalculate(String[] str) {
        int result = Integer.parseInt(str[0]);
        for(int i = 0; i < str.length - 2; i += 2) {
            result = calculate(result, Integer.parseInt(str[i + 2]), str[i + 1].charAt(0));
        }
        return result;
    }
}
