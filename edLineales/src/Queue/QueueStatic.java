package Queue;

import Queue.EmptyQueueException;
import Queue.Queue;

/**
 * The "QueueStatic" class will be used to perform the operation of a static queue,
 * it implements the "Queue" interface, used as a template for this class.
 * 
 * In this class the different methods that will make possible its correct
 * operation will be defined and developed.
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: October 17, 2022
 * @version 1.0
 */

public class QueueStatic<T> implements Queue<T>{
	
	private int size;
	private T[] cola;
	private int sizeControl;
	
	
/**
 * The constructor of the class, it is used to initialize the variables of the class.
 */
	public QueueStatic() {
		size = 100;
		sizeControl = 0;
		cola = (T[]) new Object [size];
	}      
	
/**
 * This function adds an element to the queue
 * 
 * @param element The element to be added to the queue.
 */
	public void enqueue(T element) {
		
		if(sizeControl>size){
			enqueue(element);
		}else {
		cola[sizeControl] = element;
		sizeControl++;
		}
	}  
	
/**
 * This function removes the first element of the queue and returns it
 * 
 * @return The first element of the queue.
 */
	public T dequeue() throws EmptyQueueException {
		
		if(isEmpty()) {
			throw new EmptyQueueException("Esta cola esta vacia");
		}else {
		T element = cola[0];
		
		for (int i = 0; i<sizeControl; i++) {
			cola[i]=cola[i+1];
			
		}
			cola[sizeControl] = null;
			sizeControl--;
		
		return element;
		}
	}

	
/**
 * Returns the element at the front of the queue without removing it
 * 
 * @return The first element of the queue.
 */
	public T front() throws EmptyQueueException {
		if (isEmpty()) {
			throw new EmptyQueueException("Esta cola esta vacia");
		}else {
		
		return cola[0];
		}
	}

	
/**
 * Returns true if the size of the list is 0, false otherwise
 * 
 * @return The size of the stack.
 */
	public boolean isEmpty() {
		return sizeControl==0;
	}

	
/**
 * Returns the number of elements in the list
 * 
 * @return The size of the list.
 */
	public int size() {
		return sizeControl;
	}
}