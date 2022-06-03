package com.StackQueue;

public class StackElement<T> {
	T value;
	StackElement <T> next;
	
public StackElement(T value) {
	this.value=value;
	this.next=null;
}
public StackElement<T> getnext(){
	return next;
}
public T getValue() {
	return value;
}
}