package Task7_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task7_1d {
    public static void main(String[] args) {
        try {
            BufferedReader obj = new BufferedReader(new FileReader("Dog.class"));
        } catch (FileNotFoundException e) {
            System.out.println("Make sure you created Dog.class");
        }
    }
}
