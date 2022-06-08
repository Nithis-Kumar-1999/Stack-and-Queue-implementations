package com.StackQueue;
import java.util.Scanner;

public class Stack<T> {	
	StackElement<T> top;
	int size;
	public Stack() {
		this.size=0;
	}
	public void push(T newValue) {
		StackElement<T> node=new StackElement<T>(newValue);
		node.next=top;	
		top = node;
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
		return size;
	}
	public String display() {
		StackElement <T> oldTop=top;
		String str="";
		while(oldTop!=null) {
		str+=oldTop.value;
		oldTop=oldTop.next;
		}
		return str;
	}
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		Stack<Object>myObj=new Stack<Object>();
		while(true) {
			System.out.println("push:1");
			System.out.println("pop:2");
			System.out.println("peek:3");
			System.out.println("length:4");
			System.out.println("display:5");
			
			System.out.println("Enter the Input");
			switch(scn.nextInt()){
			case 1:System.out.println("Enter push element:");
			myObj.push(scn.next());
			break;
			case 2:System.out.println("pop element:"+myObj.pop());
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
