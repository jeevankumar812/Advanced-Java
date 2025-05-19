//4. Write a Java program to display elements and their positions in a linked list ( using l_listobj.get(p) )
package ListInterface;
import java.util.*;
public class Array_Index {
	 public static void main(String[] args) {

	        LinkedList<String> colors = new LinkedList<>();
	        colors.add("Orange");
	        colors.add("geen");
	        colors.add("pink");
	        colors.add("red");
	        colors.add("Blue");

	        for (int i = 0; i < colors.size(); i++) {
	            System.out.println("index: " + i + " value: " + colors.get(i));
	        }
	    }
}
