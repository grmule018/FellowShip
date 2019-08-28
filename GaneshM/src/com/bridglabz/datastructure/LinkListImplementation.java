package com.bridglabz.datastructure;
//import com.bridglabz.datastructure.Node;
public class LinkListImplementation {

	public static void main(String[] args) throws java.lang.Exception {
		
		//Object creating for linklist
		LinkedListT A = new LinkedListT();
		
		//Push into stack at begining
		A.addAtBegin(1);
		A.addAtBegin(2);
		
		//Push into stack at End
		A.addAtEnd(20);
		A.addAtEnd(31);
		
		//Delete node at begin
		A.deleteAtBegin();
		
		//Delete note at End
		A.deleteAtEnd();
		
		//Adding Node At index
		A.addAtIndex(10, 2);
		
		//Adding Node at End
		A.addAtEnd(15);
		
		//Display Data of Linklist
		A.display();
		
		// Print the size of stack
		System.out.println("\n Size of the list is: " + A.size);
		
		//Print the second position of element
		System.out.println(" Element at 2nd position : " + A.elementAt(2));
		
		//Print search element
		System.out.println(" Searching element location : " + A.search(15));
	}
}

