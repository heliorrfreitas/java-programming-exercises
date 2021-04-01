import java.util.*;
import java.util.stream.Stream;

class Scrabble {

    private int score = 0;
    private final Map<Integer, Set<Character>> table = Map.ofEntries(
            Map.entry(1, Set.of('a', 'e', 'i', 'o', 'u', 'l', 'n', 'r', 's', 't')),
            Map.entry(2, Set.of('d', 'g')),
            Map.entry(3, Set.of('b', 'c', 'm', 'p')),
            Map.entry(4, Set.of('f', 'h', 'v', 'w', 'y')),
            Map.entry(5, Set.of('k')),
            Map.entry(8, Set.of('j', 'x')),
            Map.entry(10, Set.of('q', 'z'))
    );

    Scrabble(String word) {
        this.score = calculateScore(word);
    }

    private int calculateScore(String word){
        int score = 0;

        for(Character c : word.toLowerCase().toCharArray()){
            score += table.entrySet()
                        .stream()
                        .map(entry -> {if (entry.getValue().contains(c))  return entry.getKey(); return 0;})
                        .mapToInt(Integer::intValue)
                        .sum();
        }

        return score;
    }

    int getScore() {
        return score;
    }

}
