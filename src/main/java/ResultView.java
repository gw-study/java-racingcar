class ResultView {
    private static String textOfResult = "결과보기";
    private RacingCarCompetition competition;

    ResultView(RacingCarCompetition competition) {
        System.out.println();
        System.out.println(textOfResult);
        this.competition = competition;
    }

    public void showDistance() {
        int historySize = competition.history.size();

        for (int j = 0; j < historySize; j++) {
            for (String distance : competition.history.get(j)) {
                System.out.println(distance);
            }
            System.out.println();
        }
    }
}