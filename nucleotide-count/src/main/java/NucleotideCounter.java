import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.stream.IntStream;

class NucleotideCounter{
    HashMap<Character, Integer> nucleotidesCount;

    public NucleotideCounter(String dna){
        if(!dna.matches("[AGCT]*")) throw new IllegalArgumentException ();

        nucleotidesCount = new HashMap<>(Map.of('A', 0, 'C', 0, 'G', 0, 'T', 0));

        for(int i = 0; i < dna.length(); i++){
            nucleotidesCount.put(dna.charAt(i), nucleotidesCount.get(dna.charAt(i)) + 1);
        }
    }

    public HashMap<Character, Integer> nucleotideCounts() {
        return nucleotidesCount;
    }
}