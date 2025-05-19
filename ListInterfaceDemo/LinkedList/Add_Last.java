//3. Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))
package ListInterface;
import java.util.*;
public class Add_Last {
	public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("Orange");
        colors.add("geen");
        colors.add("pink");
        colors.add("red");
        colors.add("Blue");

        System.out.println(colors);

        colors.addLast("pink");

        System.out.println(colors);
    }
}
