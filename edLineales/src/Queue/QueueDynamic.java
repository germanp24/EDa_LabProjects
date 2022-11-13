package Queue;

import Queue.EmptyQueueException;

/**
 * The "QueueDynamic" class will be used to perform the operation of a dynamic queue,
 * it implements the "Queue" interface, used as a template for this class.
 * 
 * In this class the different methods that will make possible its correct
 * operation will be defined and developed.
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: October 17, 2022
 * @version 1.0
 */

public class QueueDynamic<T> implements Queue<T> {
	
	private Node<T> first;
	private Node<T> last;
	private int size;
	
/**
 * The constructor of the class, it is used to initialize the attributes of the class.
 */
	public QueueDynamic() {
		first = null;
		last = null;
		size = 0;
	}
	
/**
 * If the queue is empty, the new element becomes the first and last element. If the queue has one element, the new element
 * becomes the last element. If the queue has more than one element, the new element becomes the last element.
 * 
 * @param element the element to be added to the queue
 */
	public void enqueue(T element) {
		
		Node<T> aux = new Node(element, null);
		
		if(isEmpty()) {
			first = aux;
			last = aux;
			
		}else {
			if (size() == 1) {
				first.setNext(aux);
			}else {
				last.setNext(aux);
			}
			last = aux;
		}
		size++;
	}

	
/**
 * The function dequeue() removes the first element of the queue and returns it
 * 
 * @return The first element of the queue.
 */
	public T dequeue() throws EmptyQueueException{
		
		if (isEmpty()) {
			throw new EmptyQueueException("La cola esta vacia");
		}else {
			T element = first.getElement();
			Node<T> aux = first.getNext();
			
			first = aux;
			size--;
			if(isEmpty()) {
				last = null;
			}
			return element;	
		}
	}

/**
 * Returns the element at the front of the queue without removing it
 * 
 * @return The first element of the queue.
 */
	public T front() throws EmptyQueueException{
		if (isEmpty()) {
			throw new EmptyQueueException("La cola esta vacia");
		}else {
			
			return first.getElement();
		}
	}

/**
 * If the first node is null, then the queue is empty
 * 
 * @return The first node in the queue.
 */
	public boolean isEmpty() {
		
		return first == null;
	}
	
/**
 * Returns the number of elements in the queue
 * 
 * @return The size of the queue.
 */
	public int size() {
	
		return size;
	}
}