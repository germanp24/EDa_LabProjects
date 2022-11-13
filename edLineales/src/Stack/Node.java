package Stack;

import Stack.Node;

/**
 * The "Node" class is used to represent the nodes that
 * will go inside the stacks so that they can be of any type.
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: October 10, 2022
 * @version: 1.0
 */

public class Node<T>{

	private T element;
	private Node<T> next;
	
	/**
	 * Node constructor
	 * @param element
	 * @param next
	 */
	public Node(T element, Node<T> next) {
		this.element = element;
		this.next = next;
	}

/**
 * Sets the element given as a parameter
 * @param element T.
 */
	public void setElement(T element) {
		this.element = element;
	}


/**
 * This function sets the next node in the stack
 * @param next The next node in the list.
 */
	public void setNext(Node<T> next) {
		this.next = next;
	}

/**
 * Returns an element stored in the stack
 * @return The element of the stack.
 */
	public T getElement() {
		return element;
	}

/**
 * Gets the next element from the stack
 * @return The next node in the stack.
 */
	public Node<T> getNext() {
		return next;
	}

/**
 * The function returns a string representation of the element in the node
 * @return The element of the node.
 */
	public String toString() {
		return " "+element;
	}
}