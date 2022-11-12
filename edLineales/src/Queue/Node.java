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
	
	public Node(T element, Node<T> next) {
		
		this.element = element;
		this.next = next;
	}
	
	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public String toString() {
		return " "+element ;
	}
}