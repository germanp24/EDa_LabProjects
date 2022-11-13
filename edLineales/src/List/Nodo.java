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
	
/**
 * The constructor of the class, it is used to initialize the variables of the class.
 */
	public Nodo() {
		next=null;
		this.element=element;
	}


/**
 * A constructor that receives two parameters, one of type T and the other of type Nodo<T>.
 * 
 * @param element
 * @param next
 */
	public Nodo(T element, Nodo<T> next) {
		this.element = element;
		this.next = next;
	}
	
/**
 * A constructor that receives a parameter of type T and initializes the variables of the class.
 * 
 * @param element
 */
	public Nodo(T element) {
		next=null;
		this.element=element;
	}
	
/**
 * Returns the element stored in this node
 * 
 * @return The element of the node.
 */
	public T getElement() {
		return element;
	}

/**
 * Sets the element given as a parameter.
 * 
 * @param element The element to be stored in the node.
 */
	public void setElement(T element) {
		this.element = element;
	}

/**
 * Gets the next element from the stack
 * 
 * @return The next node in the list.
 */
	public Nodo<T> getNext() {
		return next;
	}

/**
 * This function sets the next node in the queue
 * 
 * @param next The next node in the list.
 */
	public void setNext(Nodo<T> next) {
		this.next = next;
	}
	
/**
 * The function returns a string representation of the element in the node
 * 
 * @return The element of the node.
 */
	public String toString() {
		return element + " ";
	}

/**
 * It compares the current element with the element passed as a parameter
 * 
 * @param element The element to compare to.
 * @return The method returns a boolean value.
 */
	@Override
	public boolean CompareTo(T element) {
		boolean match=false;
		
		if(((Diccionario)this.element).equal((Diccionario)element)) {
			match=true;
		}
		return match;
	}
}