import java.util.Stack;

class ReverseString {

    String reverse(String inputString){
        StringBuilder reversedString = new StringBuilder();
        Stack<String> stack = new Stack<>();

        inputString.chars().forEach(c -> stack.push(Character.toString(c)));
        inputString.chars().forEach(c -> reversedString.append(stack.pop()));

        return reversedString.toString();
    }


}
