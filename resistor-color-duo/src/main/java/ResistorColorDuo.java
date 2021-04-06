import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class ResistorColorDuo {

    private final Map<String, Integer> resistorColors = Map.ofEntries(
            Map.entry("black", 0),
            Map.entry("brown", 1),
            Map.entry("red", 2),
            Map.entry("orange", 3),
            Map.entry("yellow", 4),
            Map.entry("green", 5),
            Map.entry("blue", 6),
            Map.entry("violet", 7),
            Map.entry("grey", 8),
            Map.entry("white", 9)
    );

    final int MAX_AMOUNT_OF_RESISTORS = 2;

    int value(String[] colors) {
        String result = Arrays.stream(colors)
                .limit(MAX_AMOUNT_OF_RESISTORS)
                .map(c -> {if(resistorColors.containsKey(c)) return resistorColors.get(c); return -1;})
                .filter(c -> c != -1)
                .map(String::valueOf)
                .collect(Collectors.joining());

        return Integer.parseInt(result);
    }
}
