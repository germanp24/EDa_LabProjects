package Queue;

import Queue.EmptyQueueException;

/**
 * In the "Queue" interface we created a template on which
 * we will base all the classes that we will create later to
 * develop the exercise and create both static and dynamic queues.
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: October 17, 2022
 * @version: 1.0
 */

public interface Queue<T> {
	
	public void enqueue(T element);
	
	public T dequeue() throws EmptyQueueException;
	
	public T front() throws EmptyQueueException;
	
	public boolean isEmpty();
	
	public int size();
	
	public String toString();
}