public class Twofer {
    public String twofer(String name) {
        StringBuilder message = new StringBuilder()
                .append("One for")
                .append(" ")
                .append(name == null ? "you" : name)
                .append(", one for me.");

        return message.toString();
    }
}
