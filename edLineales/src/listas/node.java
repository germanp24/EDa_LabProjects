package listas;



public class node<T> implements comparable<T>{
	private T element;
	private node<T> next;
	
	
	public node() {
		next=null;
		this.element=element;
	}

	public node(T element, node<T> next) {
		
		this.element = element;
		this.next = next;
		
	}
	
	public node(T element) {
		next=null;
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

	@Override
	public boolean compareTo(T element) {
		
		if(getElement() == element) {
			
			return true;
			
		}else {return false;}
	}
	
}
	
