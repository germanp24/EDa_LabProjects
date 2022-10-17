package edLineales2022_23;

public interface Stack<T> {

	/**
	 * 
	 * @param T
	 */
	void push(T element);

	int size();

	boolean isEmpty();

	T pop() throws StackEmptyException;

	T top()throws StackEmptyException;

}