package cola;

public interface queue<T> {
	
	public void enqueue(T element);
	
	public T dequeue() throws EmptyQueueException;
	
	public T front() throws EmptyQueueException;
	
	public boolean isEmpty();
	
	public int size();
	
	public String toString();
	
}
