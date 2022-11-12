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
	
	public QueueDynamic() {
		first = null;
		last = null;
		size = 0;
	}
	
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

	public T front() throws EmptyQueueException{
		if (isEmpty()) {
			throw new EmptyQueueException("La cola esta vacia");
		}else {
			
			return first.getElement();
		}
	}

	public boolean isEmpty() {
		
		return first == null;
	}
	
	public int size() {
	
		return size;
	}
}