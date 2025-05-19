//7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate()
package StringOperations;

public class TruncateString {
    public static String truncate(String str, int length) {
        if (str.length() <= length) return str;
        return str.substring(0, length) + "...";
    }

    public static void main(String[] args) {
        String input = "This is a long sentence that needs to be shortened.";
        System.out.println("Input: " + input);
        System.out.println("Output: " + truncate(input, 20));
    }
}
