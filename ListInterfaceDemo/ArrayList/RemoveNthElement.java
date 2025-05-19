//5. Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index
package ListInterface;

import java.util.*;

public class RemoveNthElement {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Orange");
        colors.add("green");
        colors.add("pink");
        colors.add("red");
        colors.add("Blue");
        
        System.out.println(colors);
        System.out.println("Removing the 4th element (index 3): " + colors.remove(3));
        System.out.println(colors);
    }
}

