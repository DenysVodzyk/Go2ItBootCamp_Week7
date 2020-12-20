package Task7_1;

public class Task7_1b {
    public static void main(String[] args) {
        String word = "GoGoJava";

        try {
            int index = word.indexOf('X');
            String wordSubstring = word.substring(index);
            System.out.println(wordSubstring);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Verify that input word contains letter 'X'.");
        }
    }
}
