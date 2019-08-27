package com.bridglabz.datastructure;

public class LinkListImplementation {

	public static void main(String[] args) throws java.lang.Exception {
		LinkedListT A = new LinkedListT();
		A.addAtBegin(1);
		A.addAtBegin(2);
		A.addAtEnd(20);
		A.addAtEnd(31);
		A.deleteAtBegin();
		A.deleteAtEnd();
		A.addAtIndex(10, 2);
		A.addAtEnd(15);
		A.display();
		System.out.println("\n Size of the list is: " + A.size);
		System.out.println(" Element at 2nd position : " + A.elementAt(5));
		System.out.println(" Searching element 20, location : " + A.search(15));
	}
}
 class Node {
	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

 class LinkedListT {
	public Node head;
	public int size;
	public LinkedListT() {
		head = null;
	}
	public void addAtBegin(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
		size++;
	}
	public int deleteAtBegin() {
		int tmp = head.data;
		head = head.next;
		size--;
		return tmp;
	}
	public void deleteAtEnd() {
		Node currNode = head;
		if (head.next == null) {
			head = null;
		} else {
			while (currNode.next.next != null) {
				currNode = currNode.next;
			}
			int temp = currNode.next.data;
			currNode.next = null;
			size--;
		}
	}
	public void addAtEnd(int data) {
		if (head == null) {
			addAtBegin(data);
		} else {
			Node n = new Node(data);
			Node currNode = head;
			while (currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = n;
			size++;
		}
	}
	public int elementAt(int index){
		if(index>size){
			return -1;
		}
		Node n = head;
		while(index-1!=0){
			n=n.next;
			index--;
		}
		return n.data;
	}
	public int getSize(){
		return size;
	}
	public int search(int data){
		Node n = head;
		int count = 1;
		while(n!=null){
			if(n.data==data){
				return count;
			}else{
				n = n.next;
				count++;
			}
		}
		return -1;
	}
	public void addAtIndex(int data, int position){
		if(position == 1){
			addAtBegin(data);
		}
		int len = size;
		if (position>len+1 || position <1){
			System.out.println("\nINVALID POSITION");
		}
		if(position==len+1){
			addAtEnd(data);
		}
		if(position<=len && position >1){
			Node n = new Node(data);
			Node currNode = head; //so index is already 1
			while((position-2)>0){
				System.out.println(currNode.data);
				currNode=currNode.next;
				position--;
			}
			n.next = currNode.next;
			currNode.next = n;
			size++;
		}
	}
	public void display() {
		System.out.println("");
		Node currNode = head;
		while (currNode != null) {
			System.out.print("->" + currNode.data);
			currNode = currNode.next;
		}
	}
}