import java.util.HashSet;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        HashSet<Character> existingLetters =  new HashSet<>();

        for(int i = 0; i < phrase.length(); i++){
            char character = phrase.toLowerCase().charAt(i);

            if(existingLetters.contains(character) &&
                ((character >= 'a' && character <= 'z'))){
               return false;
            }

            existingLetters.add(character);
        }
        String test = phrase.replaceAll("-", "");
        boolean bool = test.chars().distinct().count() == phrase.length();
        return true;
    }

}
