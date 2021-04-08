import java.util.stream.IntStream;

class IsbnVerifier {
    private final int ISBN_10_SIZE = 10;

    boolean isValid(String stringToVerify) {
        String cleanedString = stringToVerify.replace("-", "");
        if(cleanedString.length() == ISBN_10_SIZE && cleanedString.matches("([0-9]{10}$|[0-9]{9}X$)")){
            int resultSumDigits = IntStream.range(0, ISBN_10_SIZE)
                    .map(i -> calculateIsbnDigit(i, cleanedString.charAt(i)))
                    .sum();

            return resultSumDigits % 11 == 0;
        }
        return false;
    }

    public int calculateIsbnDigit(int i, Character digit){
        int isbnDigit = Integer.parseInt(digit == 'X' ? "10" : Character.toString(digit));
        return (ISBN_10_SIZE - i) * isbnDigit;
    }

}
