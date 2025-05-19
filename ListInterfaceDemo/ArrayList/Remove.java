//2. Write a java program for getting different colors through ArrayList interface and remove the 2nd element and color "Blue" from the ArrayList
package ListInterface;

import java.util.*;

public class Remove {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Orange");
        colors.add("geen");
        colors.add("pink");
        colors.add("red");
        colors.add("Blue");

        System.out.println(colors);

        colors.remove(2);  
        System.out.println(colors);

        colors.remove("Blue");  
        System.out.println(colors);
    }
}
