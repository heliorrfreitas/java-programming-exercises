import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class RaindropConverter {

    private static Map<Integer, String> RAIN_DROP_SOUNDS = new HashMap<>();

    static {
        RAIN_DROP_SOUNDS.put(3, "Pling");
        RAIN_DROP_SOUNDS.put(5, "Plang");
        RAIN_DROP_SOUNDS.put(7, "Plong");
    }

    String convert(int number) {
        StringBuilder message = new StringBuilder();

        RAIN_DROP_SOUNDS.forEach((key, value) -> {
            if(number % key == 0) message.append(value);
        });

        return message.isEmpty() ? Integer.toString(number) : message.toString();
    }

}
