public class Hamming {

    private String leftStrand;
    private String rightStrand;
    private int hammingDistance;

    public Hamming(String leftStrand, String rightStrand) {
        validateInput(leftStrand, rightStrand);
        this.hammingDistance = calculateHammingDistance(leftStrand, rightStrand);
    }

    private void validateInput(String leftStrand, String rightStrand) {
        if(leftStrand.length() != rightStrand.length()) {
            String message = "leftStrand and rightStrand must be of equal length.";

            if (rightStrand.isEmpty()) {
                message = "right strand must not be empty.";
            }else if (leftStrand.isEmpty()) {
                message = "left strand must not be empty.";
            }

            throw new IllegalArgumentException(message);
        }
    }

    private int calculateHammingDistance(String leftStrand, String rightStrand) {
        int count = 0;
        for(int i = 0; i < leftStrand.length(); i++){
            if(leftStrand.charAt(i) != rightStrand.charAt(i)){
                count += 1;
            }
        }
        return count;
    }

    public int getHammingDistance() {
        return hammingDistance;
    }
}
