package Task7_1;

public class Task7_1a {
    public static void main(String[] args) {
        try {
            String consoleElement = args[99];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Verify if you entered 99th element into console field.");
        }
    }
}
