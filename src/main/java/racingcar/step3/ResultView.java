package racingcar.step3;

public class ResultView {
    public static void resultViewStart() {
        System.out.println("실행 결과");
    }

    public static void resultView(int[] cars, int seq) {
        for (int i=0; i < cars.length; i++){
            print(cars[i]);
        }
        System.out.println();
    }

    public static void print(int cars){
        for (int i=0; i < cars; i++){
            System.out.print("-");
        }
        System.out.println();
    }
}
