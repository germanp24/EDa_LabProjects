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

	public void push (T element);

	public T pop() throws EmptyStackException;
	
	public T top() throws EmptyStackException;
	
	public boolean isEmpty() throws EmptyStackException;
	
	public int size();

	public String toString();
}

//AÑADIR JAVADOC EN METODOS DE LA INTERFAZ?????????????????