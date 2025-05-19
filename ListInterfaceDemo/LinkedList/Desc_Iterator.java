//2. Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())
package ListInterface;
import java.util.Iterator;
import java.util.LinkedList;
public class Desc_Iterator {
	public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("Orange");
        colors.add("geen");
        colors.add("pink");
        colors.add("red");
        colors.add("Blue");

        Iterator<String> iterator = colors.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
