package Task7_2;

public class CheckedUncheckedException {
    public static void main(String[] args) {

        CheckedUncheckedException obj = new CheckedUncheckedException();

        obj.firstMethod("ClassToUSe");
        obj.secondMethod(999);
        obj.thirdMethod("John");
    }


    public void firstMethod(String className) {
        /*
        Checked exception:
        The forName() method of java.lang.Class class is used to get the instance of this Class
        with the specified class name. This class name is specified as the string parameter.
        */
        try {
            Class newClass = Class.forName(className);
            newClass.getName();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("--------------------------------------------------");
        }
    }

    public void secondMethod(int inputNumber) {
        //ClassCastException
        try {
            Object number = Integer.valueOf(inputNumber);
            String word = (String) number;
            System.out.println(word);
        } catch (ClassCastException e) {
            System.out.println(e.toString());
            System.out.println("--------------------------------------------------");
        }
    }

    public void thirdMethod(String input) {
        //NumberFormatException
        try {
            Object obj = Integer.valueOf(input);
            System.out.println(input);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("--------------------------------------------------");
        }
    }
}
