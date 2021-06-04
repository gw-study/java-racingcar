public final class StringCalculator {

    public String[] enterCommand(String input) throws IllegalArgumentException {
        if (isBlank(input)) {
            throw new IllegalArgumentException("Input IllegalArgument Exception");
        }

        String[] inputs = input.split(" ");

        return inputs;
    }

    public String calculate(String str1, String operator, String str2) throws IllegalArgumentException {

        int result = 0;
        int num1 = parseInt(str1);
        int num2 = parseInt(str2);

        if (operator.equals("+")) {
            result = add(num1, num2);
            return toString(result);
        }
        if (operator.equals("-")) {
            result = substract(num1, num2);
            return toString(result);
        }
        if (operator.equals("*")) {
            result = multiple(num1, num2);
            return toString(result);
        }
        if (operator.equals("/")) {
            result = divide(num1, num2);
            return toString(result);
        }

        throw new IllegalArgumentException("Operator IllegalArgument Exception");
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int substract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiple(int num1, int num2) {
       return num1 * num2;
    }

    public int divide(int num1, int num2) throws ArithmeticException{
        if (num2 == 0) {
            throw new ArithmeticException("ArithmeticException");
        }

        return num1 / num2;
    }

    public int parseInt(String str) {
        return Integer.parseInt(str);
    }

    public String toString(int num) {
        return Integer.toString(num);
    }

    public Boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();

    }
}

