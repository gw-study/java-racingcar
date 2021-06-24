public class Calculator {

    private String[] stringSplit(String calculateString){
        String[] splitString = calculateString.split(" ");
        if( splitString.length == 0 ){
            throw new IllegalArgumentException("입력 값이 빈 공백 문자입니다.");
        } else if( splitString.length < 3 ){
            throw new IllegalArgumentException("입력 값이 올바르지 않습니다.");
        }
        return splitString;
    }

    private int[] splitStringToInt(String[] splitString){
        int[] splitStringToInt = new int[splitString.length];
        for( int i=0 ; i < splitString.length ; i+=2 ){
            splitStringToInt[i] = Integer.parseInt(splitString[i]);
        }
        return splitStringToInt;
    }

    public int stringCalculator(String input){
        String[] splitString = stringSplit(input);
        int[] splitStringToInt = splitStringToInt(splitString);

        for( int i=1 ; i < splitString.length ; i+=2 ){
            splitStringToInt[i+1] = Operator.calculate(splitStringToInt[i-1], splitStringToInt[i+1], splitString[i]);
        }
        return splitStringToInt[splitString.length-1];
    }
}
