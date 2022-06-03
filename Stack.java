package com.StackQueue;
import java.util.Scanner;

public class Stack<T> {
	int size;
	StackElement<T>top;
	public Stack() {
		this.size=0;
	}
	public void push(T newValue) {
		StackElement<T>newElement=new StackElement<T>(newValue);
		newElement.next=top;	
		top=newElement;
		size++;
	}
	public T pop() {
		StackElement <T> oldTop=top;
		if(size==0) {
			return null;
		}
		else
			top=top.next;
			size--;
			return oldTop.getValue();
	}
	public T peek() {
		if(size==0) {
			return null;
		}
		else {
			return top.getValue();
		}
	}
	public int length() {
		return(size);
	}
	public String display() {
		String str="";
		while(top!=null) {
		str+=top.value;
		top=top.next;
		}
		return str;
	}
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		//Stack<Integer>myInt=new Stack<Integer>();
		Stack<String>mystr=new Stack<String>();
		while(true) {
			System.out.println("push:1");
			System.out.println("pop:2");
			System.out.println("peek:3");
			System.out.println("length:4");
			System.out.println("display:5");
			
			System.out.println("Enter the Input");
			switch(scn.nextInt()){
			case 1:System.out.println("Enter push element:");
			mystr.push(scn.next());
			break;
			case 2:System.out.println("pop element:"+mystr.pop());
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
