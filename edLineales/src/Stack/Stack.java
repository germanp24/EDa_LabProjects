package Stack;

import Stack.EmptyStackException;

/**
 * In the "Stack" interface we created a template on which
 * we will base all the classes that we will create later to
 * develop the exercise and create both static and dynamic stacks.
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: October 10, 2022
 * @version: 1.0
 */

public interface Stack<T> {

/**
 * Push an element onto the stack.
 * @param element The element to be pushed onto the stack.
 */
	public void push (T element);

/**
 * Pop an element onto the stack.
 */
	public T pop() throws EmptyStackException;
	
/**
 * Obtains the top element of the stack.
 */
	public T top() throws EmptyStackException;
	
/**
 * Check if the stack is empty.
 */
	public boolean isEmpty() throws EmptyStackException;
	
/**
 * Returns the number of elements in this list.
 * 
 * @return The size of the list.
 */
	public int size();

	/**
	 * Returns a string representation of the object.
	 */
	public String toString();
}