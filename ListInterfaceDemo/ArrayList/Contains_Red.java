//1. Write a java program for getting different colors through ArrayList interface and search whether the color "Red" is available or not

package ListInterface;
import java.util.*;
public class Contains_Red {
	 public static void main(String[] args) {

	        List<String> colors = new ArrayList<>();
	        colors.add("Orange");
	        colors.add("geen");
	        colors.add("pink");
	        colors.add("red");

	        System.out.println(colors);

	        // Check if list contains "red"
	        if (colors.contains("red")) {
	            System.out.println("Contains Red");
	        } else {
	            System.out.println("Does not contain Red");
	        }
	    }
}
