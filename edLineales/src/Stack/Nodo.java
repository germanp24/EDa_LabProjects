package Stack;

import Stack.Nodo;

public class Nodo<T>{

	private T element;
	private Nodo<T> next;
	
	public Nodo(T element, Nodo<T> next) {
		
		this.element = element;
		this.next = next;
	}

	

	public void setElement(T element) {
		this.element = element;
	}
	
	
	public void setNext(Nodo<T> next) {
		this.next = next;
	}
	public T getElement() {
		return element;
	}
	public Nodo<T> getNext() {
		return next;
	}
	public String toString() {
		return " "+element;
	}
	
	
	
}
