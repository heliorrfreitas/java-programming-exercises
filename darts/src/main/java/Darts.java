class Darts {

    private int score = 0;
    private final int OUTER_CIRCLE_RADIUS = 10;
    private final int MIDDLE_CIRCLE_RADIUS = 5;
    private final int INNER_CIRCLE_RADIUS = 1;

    Darts(double x, double y) {
        this.score = calculateScore(x, y);
    }

    private int calculateScore(double x, double y) {
        int score = 0;
        //double distanceDartLanded = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
        double distanceDartLanded = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));

        if(distanceDartLanded <= OUTER_CIRCLE_RADIUS
                && distanceDartLanded > MIDDLE_CIRCLE_RADIUS){
            score = 1;
        }else if(distanceDartLanded <= MIDDLE_CIRCLE_RADIUS
                && distanceDartLanded > INNER_CIRCLE_RADIUS){
            score = 5;
        }else if(distanceDartLanded <= INNER_CIRCLE_RADIUS){
            score = 10;
        }

        return score;
    }

    int score() {
        return score;
    }

}
