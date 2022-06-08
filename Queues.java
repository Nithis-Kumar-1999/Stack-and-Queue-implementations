package com.StackQueue;
import java.util.Scanner;

public class Queues<T> {
	int size;
	QueueElement<T>front;
	public Queues() {
		this.size=0;
}
	public void enqueue(T newValue) {
		QueueElement<T>node=new QueueElement<T>(newValue);
		if(front==null) {
		front=node;
		}
		else {
			QueueElement<T> temp=front;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=node;
		}
	    size++;
	}
	public T dequeue() {
		if(size==0) {
			return null;
		}
		else {
			T data= front.getValue();
			front=front.getnext();
			size--;
			return data;
		}
	}
	public T peek() {
		if(size==0) {
			return null;
		}
		else {
			return front.getValue();
		}
	}
	public int length() {
		return size;
	}
	public String display() {
	QueueElement<T> temp=front;
	String str="";
	while(temp!=null) {
	str+=temp.value;
	temp=temp.next;
	}
	return str;
	}
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		Queues<Object>myObj=new Queues<Object>();
		while(true) {
			System.out.println("enqueue:1");
			System.out.println("dequeue:2");
			System.out.println("peek:3");
			System.out.println("length:4");
			System.out.println("display:5");
			
			System.out.println("Enter the Input");
			switch(scn.nextInt()) {
			case 1:System.out.println("Enter enqueue element:");
			myObj.enqueue(scn.next());
			break;
			case 2:System.out.println("dequeue element:"+myObj.dequeue());
			break;
			case 3:System.out.println("peek element:"+myObj.peek());
			break;
			case 4:System.out.println("length element:"+myObj.length());
			break;
			case 5:System.out.println("display element:"+myObj.display());
			break;
			
			default:System.out.println("Invalid values");
			}
		}
	}
}
