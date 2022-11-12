package List;

import List.Comparable;

/**
 * The "Nodo" class contains the elements with which the lists will work
 * and allows their implementation in any other class.
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: November 7, 2022
 * @version: 1.0
 */

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
		this.element=element;
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
	public boolean CompareTo(T element) {
		boolean match=false;
		
		if(((Diccionario)this.element).equal((Diccionario)element)) {
			match=true;
		}
		return match;
	}
}