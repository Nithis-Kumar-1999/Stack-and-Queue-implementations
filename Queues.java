package com.StackQueue;
import java.util.Scanner;

public class Queues<T> {
	int size;
	QueueElement<T>front;
	public Queues() {
		this.size=0;
}
	public void enqueue(T newValue) {
		QueueElement<T>newElement=new QueueElement<T>(newValue);
		if(front==null) {
		front=newElement;
		}
		else {
			QueueElement<T> temp=front;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newElement;
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
		//Queues<Integer>myInt=new Queues<Integer>();
		Queues<String>mystr=new Queues<String>();
		while(true) {
			System.out.println("enqueue:1");
			System.out.println("dequeue:2");
			System.out.println("peek:3");
			System.out.println("length:4");
			System.out.println("display:5");
			
			System.out.println("Enter the Input");
			switch(scn.nextInt()) {
			case 1:System.out.println("Enter enqueue element:");
			mystr.enqueue(scn.next());
			break;
			case 2:System.out.println("dequeue element:"+mystr.dequeue());
			break;
			case 3:System.out.println("peek element:"+mystr.peek());
			break;
			case 4:System.out.println("length element:"+mystr.length());
			break;
			case 5:System.out.println("display element:"+mystr.display());
			break;
			
			default:System.out.println("Invalid values");
			}
		}
	}
}
