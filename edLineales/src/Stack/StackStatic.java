package Stack;
import Stack.EmptyStackException;

/**
 * The "StackStatic" class will be used to perform the operation of a static stack,
 * it implements the "Stack" interface, used as a template for this class.
 * 
 * In this class the different methods that will make possible its correct
 * operation will be defined and developed.
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: October 17, 2022
 * @version 1.0
 */

public class StackStatic<T> implements Stack<T>{
	
	private int size;
	private T[] stack;
	private int top;
		
/**
 * The constructor of the class, it is used to initialize the variables of the class.
 */
	public StackStatic() {
		size=100;
		this.top =0;
		stack = (T[]) new Object [size];
	}

	
/**
 * If the stack is empty, throw an exception. Otherwise, decrement the top pointer and return the element at the top of the stack.
 * 
 * @return The top element of the stack.
 */
	public T pop() throws EmptyStackException {	
		if(isEmpty()) { 
			throw new EmptyStackException("Esta pila esta vacia");
		}else {
			top--;
			return stack[top];  
		} 
	}
	
/**
 * If the stack is empty, throw an exception. Otherwise, return the top element of the stack
 * 
 * @return The top element of the stack.
 */
	public T top() throws EmptyStackException {
		
		if (isEmpty()) {
			throw new EmptyStackException("Esta pila esta vacia");
			
		}else {
			
			return stack[top-1];
		}
	}

	
/**
 * Returns true if the stack is empty, false otherwise.
 * 
 * @return The method is returning a boolean value.
 */
	public boolean isEmpty() throws EmptyStackException {
		return top == 0;
	}
	
/**
 * Returns the number of elements in the stack
 * 
 * @return The size of the stack.
 */
	public int size() {
		return top;
	}

/**
 * It adds an element to the top of the stack.
 * 
 * @param element The element to be pushed into the stack.
 */
	public void push(T element) throws ArrayIndexOutOfBoundsException{
		if(top>size) {
			push(element);
		}else if (top<size) {
			stack[top] = element;
		top++;
		}else {
			throw new ArrayIndexOutOfBoundsException("El indice de esta pila es mayor al de su tamano");
		}
	}
}