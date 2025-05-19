//10. Write a Java Program for Counting the number of words in a string using user defined functioncountWords()
package StringOperations;

public class WordCounter {
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        String input = "   Java is a powerful language.   ";
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: Word count = " + countWords(input));
    }
}

