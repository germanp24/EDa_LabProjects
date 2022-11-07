package Queue;

import Queue.EmptyQueueException;




public class QueueDynamic<T> implements Queue<T> {
	
	private Nodo<T> first;
	private Nodo<T> last;
	private int size;
	
	public QueueDynamic() {
		first = null;
		last = null;
		size = 0;
	}

	
	public void enqueue(T element) {
		
		Nodo<T> aux = new Nodo(element, null);
		
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
			Nodo<T> aux = first.getNext();
			
			
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
