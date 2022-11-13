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
	
/**
 * The constructor of the class, it is used to initialize the attributes of the class.
 */
	public StackDynamic() {
		top = null;
		size=0;
	}
	

/**
 * It adds an element to the top of the stack.
 * 
 * @param element The element to be pushed onto the stack.
 */
	public void push(T element) {
		
		Node<T> aux = new Node<>(element, top);
        top = aux;
        this.size++;
	}

/**
 * If the stack is empty, throw an exception. Otherwise, get the element at the top of the stack, get the next node, set the top to
 * the next node, decrement the size, and return the element
 * 
 * @return The element that was at the top of the stack.
 */
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
	
/**
 * If the stack is empty, throw an exception. Otherwise, return the element at the top of the stack
 * 
 * @return The element of the top node.
 */
	public T top() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("Esta pila esta vacia");
		}else {
			 return top.getElement();
		}
	}
	
/**
 * Returns the number of elements in the list.
 * 
 * @return The size of the array.
 */
	public int size() {
		return this.size;
	}

/**
 * If the top of the stack is null, then the stack is empty.
 * 
 * @return The top of the stack
 */
	public boolean isEmpty() throws EmptyStackException {
		return top == null;
	}

/**
 * Returns the top element of the stack.
 * 
 * @return The top node of the stack.
 */
	public Node<T> getTop() {
		return top;
	}

/**
 * This function sets the top of the stack to the node passed in as a parameter
 * 
 * @param top The top of the stack
 */
	public void setTop(Node<T> top) {
		this.top = top;
	}

/**
 * This function returns the size of the array
 * 
 * @return The size of the array.
 */
	public int getSize() {
		return size;
	}

/**
 * This function sets the size of the current object to the value of the parameter.
 * 
 * @param size The size of the array.
 */
	public void setSize(int size) {
		this.size = size;
	}
}