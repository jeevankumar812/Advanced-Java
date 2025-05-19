//2. Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences()
package StringOperations;

public class SubstringCounter {
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String main = "hello hello world hello";
        String sub = "hello";
        System.out.println("Input: \"" + main + "\"");
        System.out.println("Substring: \"" + sub + "\"");
        System.out.println("Output: Occurrences = " + countOccurrences(main, sub));
    }
}

