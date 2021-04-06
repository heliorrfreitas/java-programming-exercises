import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class ResistorColor {

    private final String[] resistorColors = {
            "black",
            "brown",
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "violet",
            "grey",
            "white"
    };

    int colorCode(String color) {
        return IntStream.range(0, resistorColors.length)
                    .filter(i -> resistorColors[i].equals(color))
                    .findFirst()
                    .getAsInt();
    }

    String[] colors() {
            return resistorColors;
    }
}
