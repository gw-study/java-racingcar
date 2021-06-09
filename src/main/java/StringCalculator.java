public final class StringCalculator {

    public String[] enterCommand(String input) throws IllegalArgumentException {
        if (isBlank(input)) {
            throw new IllegalArgumentException("Input IllegalArgument Exception");
        }

        return input.split(" ");
    }

    public int setInputs(String inputs) {
        String[] array = enterCommand(inputs);

        int result = parseInt(array[0]);

        for (int i =0; i < array.length - 2; i=i+2) {
            String operator = array[i+1];
            int num = parseInt(array[i+2]);

            result = calculation(result, Operation.findOperator(operator), num);
        }

        return result;
    }

    public int calculation(int num1, Operation operator, int num2) throws IllegalArgumentException {
        return operator.calculate(num1,num2);
    }

    public int parseInt(String str) {
        return Integer.parseInt(str);
    }

    public Boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }
}


