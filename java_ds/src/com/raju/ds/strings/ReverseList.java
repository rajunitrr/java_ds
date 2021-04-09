package com.raju.ds.strings;

class Node {
	int data;
	Node next;
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}


}

public class ReverseList {

	private static Node reverseList(Node head) {

		if (head == null || head.next == null) {
			return head;
		}

		Node prev = null, curr = head;
		Node next = null;
		// 1->2->3>4 c=1,p,c=null -> nex=2,curr=2,prev=1->null
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;

		}
		return prev;

	}

	static void print(Node head) {
		
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data);
			temp=temp.next;
		}
	}
	static Node rev(Node head) {
		
		if(head==null||head.next==null) {
			return head;
		}
		Node prev=rev(head.next);
		head.next.next=head;
		head.next=null;
		return prev;
		
	}
	public static void main(String[] args) {
		
		Node head=new Node(1, null);
		head.next=new Node(2,null);
		head.next.next=new Node(3,null);
		head.next.next.next=new Node(4,null);
		//print(head);

		head=rev(head);
		print(head);
	}

}
