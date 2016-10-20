import java.util.*;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> il = new LinkedList<>();  // il == <>       <-- il[null]
		il.add(5); 									  // il == <5>      <-- il[5|\]
		il.add(19); 								  // il == <5 19>   <-- il[5|->] -> [19|\]
		il.add(26); 								  // il == <5 19 26>
		il.add(1, 35);								  // il == <5 35 19 26>
		System.out.println(il);
		
		System.out.println(il.remove());			  // il == <35 19 26>, 5
        
                                                      // LinkedList are sequential because, to get to the last
                                                      // value, you have to go through the rest of the list.
	}
}