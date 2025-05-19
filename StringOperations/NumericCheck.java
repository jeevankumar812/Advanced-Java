//8. Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric()
package StringOperations;

public class NumericCheck {
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        String input = "123456";
        System.out.println("Input: " + input);
        System.out.println("Output: Is numeric? " + isNumeric(input));
    }
}
