package daa;

public class linkedlist {
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next=null;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedlist list = new linkedlist();
	
		list.head = new Node(1);
		Node secondnode = new Node(2);
		Node thirdnode = new Node(3);
		
		list.head.next=secondnode;
		secondnode.next=thirdnode;
		
		while(list.head!=null) {
			System.out.println(list.head.data);
			list.head=list.head.next;
		}
		

	}

}
