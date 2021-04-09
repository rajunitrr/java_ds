package com.raju.test;

class Node {
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		this.next=null;
	}
	
}

public class LinkedList {
	
	static Node head;
	static Node head2;

	public static void main(String[] args) {

		int n=6;
		for(int i=n;i>0;i--) {
		 
			insert(i);
		}		
		display();
		//printMid(head);
		System.out.println();
		
		
		
		
	//	printNthLast(head, 2);
	//	head=reverse(head);
		//display();
		//removeKthNode(head, 3);
		//display();
		//head=reverse(head,3);
		//display();
	}
	

	private void insertNode(int data,Node head) {
		
		if(head==null) {
		  head=new Node(data);
		}else {
			Node temp=new Node(data);
			head.next=temp;
			head=temp;
		}
		
	}
	
	private static Node reverse(Node head,int k) {
		
		if(head==null) {
			return head;
		}
		
		int count=0;
		Node prev=null,curr=head,next=null;
		while(count<k&&curr!=null) {
			
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			count++;
			
		}
		
		
       if(next!=null) {
    	   head.next=reverse(next, k);
       }
       
       return prev;
		
	}
	
	
	static void printMid(Node head) {
		
		if(head==null) {
			System.out.println("Empty list");
			return ;
		}else {
			
			Node sPtr=head;
			Node fPtr=head;
			
			while(fPtr!=null && fPtr.next!=null) {
				
				sPtr=sPtr.next;
				fPtr=fPtr.next.next;
			}
			
			System.out.println("\n Mide value is "+sPtr.data);
		}
		
	}
	
	static Node reverse(Node head) {
		
		if(head==null||head.next==null) {
			return head;
		}
		
		Node prev=reverse(head.next);
		head.next.next=head;
		head.next=null;
		return prev;		
	}
	
	static void printNthLast(Node head,int n) {
		
		if(head==null) {
			System.out.println("List is null");
		}else {	
						
			Node sPtr=head;
			Node fPtr=head;
			
			for(int i=0;i<n;i++) {
				fPtr=fPtr.next;
			}
			while(fPtr!=null) {
				
				sPtr=sPtr.next;
				fPtr=fPtr.next;
			}
			System.out.println("Nth Node value is "+sPtr.data);
		}
	}
	
	static void display() {
		
		System.out.println();
		if(head==null) {
			System.out.println("Empty List");
		}else {
			Node temp=head;
			while(temp!=null) {
				
				System.out.print(" "+temp.data);
				temp=temp.next;
			}
		}
	}
	
	//remove kth node
	
	private static void removeKthNode(Node head,int k) {
		
		if(head==null) {
			return ;
		}
		
		if(head.data==k) {
			System.out.println("Only one Node");
			return ;
		}else {
			
			Node temp=head,prev=null;
			while(temp!=null&& temp.data!=k) {
				prev=temp;
				temp=temp.next;				
			}
			
			if(temp==null) {
				System.out.println("K is not present in the list");
			}else {
				prev.next=temp.next;
			}
		}
	}
	
	public static void insert(int data) {
		
		if(head==null) {
			head=new Node(data);
		}else{
			Node temp=new Node(data);
			temp.next=head;
			head=temp;
			
		}
	}

}
