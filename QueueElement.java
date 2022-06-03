package com.StackQueue;

public class QueueElement <T> {
	T value;
	QueueElement <T> next;
	
public QueueElement(T value) {
	this.value=value;
	this.next=null;
}
public QueueElement <T>getnext(){
	return next;
}
public T getValue() {
	return value;
}
}

