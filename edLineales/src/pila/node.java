package pila;



public class node<T>{

	private T element;
	private node<T> next;
	
	

	public node(T element, node<T> next) {
		
		this.element = element;
		this.next = next;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public node<T> getNext() {
		return next;
	}

	public void setNext(node<T> next) {
		this.next = next;
	}
	
	public String toString() {
		return element + " ";
	}
	
	
	
}
