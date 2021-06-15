package racingcar;

public class ResultView {
    public void startResult(){
        System.out.println("실행결과");
    }

    public void showPosition(int count){
        for(int i = 0; i < count; i++){
            System.out.print("-");
        }
        System.out.println("");
    }
}
