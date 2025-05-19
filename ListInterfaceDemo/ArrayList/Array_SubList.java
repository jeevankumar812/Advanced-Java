//4 .Write a java program for getting different colors through ArrayList interface and extract the elements 1st and 2nd from the ArrayList object by using SubList()
package ListInterface;

import java.util.*;

public class Array_Sublist {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("Orange");
        colors.add("geen");
        colors.add("pink");
        colors.add("red");
        colors.add("Blue");

        System.out.println(colors);
        System.out.println("Using sublist:");
        System.out.println(colors.subList(0, 2));
    }
}
