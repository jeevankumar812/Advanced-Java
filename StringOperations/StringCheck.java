//1. Write a Java Program for Checking if a given string is null or contains only whitespace using user defined function isNullOrEmpty().
package StringOperations;
public class StringCheck {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void main(String[] args) {
        String input = "   "; // try with "Hello" or null
        System.out.println("Input: \"" + input + "\"");

        if (isNullOrEmpty(input)) {
            System.out.println("Output: The string is null or contains only whitespace.");
        } else {
            System.out.println("Output: The string is not null and has characters.");
        }
    }
}
