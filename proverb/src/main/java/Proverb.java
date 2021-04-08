import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Proverb {

    private String proverb;

    Proverb(String[] words) {
        this.proverb = IntStream.range(0, words.length)
                            .mapToObj(i -> buildProverb(i, words))
                            .collect(Collectors.joining());
    }

    private String buildProverb(int i, String[] words) {
        return i < words.length - 1 ?
                    String.format("For want of a %s the %s was lost.\n", words[i], words[i + 1])
                :   String.format("And all for the want of a %s.", words[0]);
    }

    String recite() {
        return proverb;
    }
}
