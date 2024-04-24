package com.pinku;



class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
public class LinkListOperations {
	Node head;
	public static void main(String[] args) {
		
		LinkListOperations list = new LinkListOperations();
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 3);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 4);
		list = insert(list, 4);
		list = insert(list, 4);
		list = insert(list, 5);
		display(list);
	//	deleteMiddleNode(list);
	//	System.out.println("After delete");
	//	display(list);
		removeDuplicate(list);
		System.out.println("Unique");
		display(list);
		
	}

	private static void removeDuplicate(LinkListOperations list) {
		
		
		if(list.head == null) {
			return;
		}
		Node temp = list.head;
		while(temp != null && temp.next != null) {
			if(temp.data == temp.next.data) {
			
				temp.next = temp.next.next;
			}else {
				temp = temp.next;
			}
		}
	}

	private static void deleteMiddleNode(LinkListOperations list) {
		if(list.head == null) {
			return;
		}
		Node prev, slow, fast;
		
		prev = null;
		slow = list.head;
		fast = list.head;
		while(fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = slow.next;
		Node temp = list.head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static LinkListOperations insert(LinkListOperations list, int data) {
		Node new_node = new Node(data);
		if(list.head == null) {
			list.head = new_node;
		}
		else {
			Node temp = list.head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = new_node;
		}
		return list;
		}
	
	public static void display(LinkListOperations list) {
		Node currNode = list.head;
		
		while(currNode != null) {
			System.out.println(currNode.data);
			currNode = currNode.next;
		}
	}
}
