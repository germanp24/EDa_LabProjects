package Queue;

/**
 * The "Node" class contains the elements with which the queues will work
 * and allows their implementation in any other class.
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: October 17, 2022
 * @version: 1.0
 */

public class Node<T> {
	
	private T element;
	private Node<T> next;
	
/**
 * A constructor that initializes the element and the next node.
 * 
 * @param element T
 * @param next Node<T>
 */
	public Node(T element, Node<T> next) {
		
		this.element = element;
		this.next = next;
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
 * Sets the element given as a parameter
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
	public Node<T> getNext() {
		return next;
	}

/**
 * This function sets the next node in the queue
 * 
 * @param next The next node in the list.
 */
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
/**
 * The function returns a string representation of the element in the node
 * 
 * @return The element of the node.
 */
	public String toString() {
		return " "+element ;
	}
}