package pila;



public interface pila<T> {
	
	
	public void push (T element);

	public T pop() throws EmptyStackException;
	
	public T top() throws EmptyStackException;
	
	public boolean isEmpty() throws EmptyStackException;
	
	public int size();
}
