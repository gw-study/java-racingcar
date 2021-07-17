package RacingCar.domain;

public class TryCnt {
    private final int TRY_LIMIT = 0;
    private int tryCnt;

    public TryCnt(int tryCnt) {
        this.tryCnt = tryCnt;
        if (this.tryCnt <= TRY_LIMIT) {
            throw new IllegalArgumentException("시도 횟수는 0 이하로 설정할 수 없습니다");
        }
    }

    public boolean checkTryCnt() {
        if (tryCnt > TRY_LIMIT) {
            tryCnt--;
            return true;
        }
        return false;
    }
}
