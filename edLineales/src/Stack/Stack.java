package Stack;

import Stack.EmptyStackException;

public interface Stack<T> {
	
	
	public void push (T element);

	public T pop() throws EmptyStackException;
	
	public T top() throws EmptyStackException;
	
	public boolean isEmpty() throws EmptyStackException;
	
	public int size();

	public String toString();
}