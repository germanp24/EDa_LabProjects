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
	
	public Node(T element, Node<T> next) {
		this.element = element;
		this.next = next;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getElement() {
		return element;
	}

	public Node<T> getNext() {
		return next;
	}

	public String toString() {
		return " "+element;
	}
}