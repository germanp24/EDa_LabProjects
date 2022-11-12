package Stack;

import Stack.EmptyStackException;
import Stack.Node;

/**
 * The "StackDynamic" class will be used to perform the operation of a dynamic stack,
 * it implements the "Stack" interface, used as a template for this class.
 * 
 * In this class the different methods that will make possible its correct
 * operation will be defined and developed.
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: October 17, 2022
 * @version 1.0
 */

public class StackDynamic<T> implements Stack<T>{
	
	private Node<T> top;
	private int size;
	
	public StackDynamic() {
		top = null;
		size=0;
	}
	
	public void push(T element) {
		
		Node<T> aux = new Node<>(element, top);
        top = aux;
        this.size++;
	}

	public T pop() throws EmptyStackException {
		
		if (isEmpty()) {
            throw new EmptyStackException("Esta pila esta vacia");
        } else {
            T element = top.getElement();
            Node<T> aux = top.getNext();
            
            top = aux; 
            this.size--;
            return element;
        }
	}
	
	public T top() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("Esta pila esta vacia");
		}else {
			 return top.getElement();
		}
	}
	
	public int size() {
		return this.size;
	}

	public boolean isEmpty() throws EmptyStackException {
		return top == null;
	}

	public Node<T> getTop() {
		return top;
	}

	public void setTop(Node<T> top) {
		this.top = top;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}