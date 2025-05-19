//1. Write a Java program to iterate through all elements in a linked list starting at the specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
package ListInterface;

import java.util.Iterator.*;
import java.util.*;
public class Iterator {
	public static void main(String[] args) {

        List<String> colors = new LinkedList<>();
        colors.add("Orange");
        colors.add("geen");
        colors.add("pink");
        colors.add("red");
        colors.add("Blue");

        ListIterator<String> iterator = colors.listIterator(2);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
