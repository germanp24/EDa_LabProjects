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
	
/**
 * Adds an element to the end of the queue.
 * 
 * @param element The element to be added to the queue.
 */
	public void enqueue(T element);
	
/**
 * Remove and return the first element of the queue.
 * 
 * @return The first element in the queue.
 */
	public T dequeue() throws EmptyQueueException;
	
/**
 * Returns the front element of the queue
 * 
 * @return The front element of the queue.
 */
	public T front() throws EmptyQueueException;
	
/**
 * Returns true if the stack is empty, false otherwise.
 * 
 * @return A boolean value.
 */
	public boolean isEmpty();
	
/**
 * Returns the number of elements in this list.
 * 
 * @return The size of the list.
 */
	public int size();
	
/**
 * Returns a string representation of the object.
 * 
 * @return A string representation of the object.
 */
	public String toString();
}