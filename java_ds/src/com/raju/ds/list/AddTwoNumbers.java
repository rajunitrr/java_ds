package com.raju.ds.list;

class ListNode {
	int val;
	ListNode next;

	public ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

}

public class AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode dummy = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummy;
		int carry = 0;
		while (p != null || q != null) {

			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;

		}

		if (carry > 0) {
			curr.next = new ListNode(carry);
		}

		return dummy.next;
	}

	public static void display(ListNode head) {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.val + ",");
			temp = temp.next;
		}
		System.out.println();

	}

	public static void main(String[] args) {

		ListNode l1 = new ListNode(2, null);
		l1.setNext(new ListNode(4, null));

		ListNode l2 = new ListNode(5, null);
		l2.next = new ListNode(6, null);

		display(l1);
		display(l2);
		ListNode head = addTwoNumbers(l1, l2);

		display(head);

	}

}
