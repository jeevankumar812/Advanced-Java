//5. Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace()

package StringOperations;

public class RemoveWhitespace {
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String input = "  Hello   World ";
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: \"" + removeWhitespace(input) + "\"");
    }
}
