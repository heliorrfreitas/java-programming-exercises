import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        return (int) Math.pow((input * (input + 1))/ 2, 2);
    }

    int computeSumOfSquaresTo(int input) {
        return IntStream.range(1, input + 1)
                .map(i -> (int) Math.pow(i, 2))
                .sum();
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
