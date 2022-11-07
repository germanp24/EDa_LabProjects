package List;

import List.Comparable;

public class Nodo<T> implements Comparable<T>{
	private T element;
	private Nodo<T> next;
	
	
	public Nodo() {
		next=null;
		this.element=element;
	}

	public Nodo(T element, Nodo<T> next) {
		
		this.element = element;
		this.next = next;
		
	}
	
	public Nodo(T element) {
		next=null;
	}
	
	

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public Nodo<T> getNext() {
		return next;
	}

	public void setNext(Nodo<T> next) {
		this.next = next;
	}
	
	public String toString() {
		return element + " ";
	}

	@Override
	public boolean CompararCon(T element) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
	

