//3. Write a Java Program for Reversing the characters in a string using user defined function reverseString().
package StringOperations;

public class ReverseString {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String input = "Jeevan Kumar";
        System.out.println("Input: " + input);
        System.out.println("Output: " + reverseString(input));
    }
}
