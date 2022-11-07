package Queue;

import Queue.EmptyQueueException;

public interface Queue<T> {
	
	public void enqueue(T element);
	
	public T dequeue() throws EmptyQueueException;
	
	public T front() throws EmptyQueueException;
	
	public boolean isEmpty();
	
	public int size();
	
	public String toString();
	
}
