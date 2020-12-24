package Task7_1;

import java.io.IOException;

public class Task7_1c {
    public static void main(String[] args) {
        int i = 2;

        try {
            if (i % 2 == 0) {
                throw new RuntimeException("This is the test exception");
            }
            //normal execution
        } catch (RuntimeException e) {
            //handleRTE
            System.out.println("Woohoo!I've caught RuntimeException");
        } finally {
            System.out.println("This code will be executed always!");
            try {
                throw new IOException("This is the test IO exception");
            } catch (IOException e) {
                System.out.println("Woohoo!I've caught IOException as well");
            }
        }
    }
}
