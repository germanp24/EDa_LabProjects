package Queue;

import Queue.EmptyQueueException;
import Queue.Queue;

public class QueueStatic<T> implements Queue<T>{
	
	private int size;
	private T[] cola;
	private int sizeControl;
	
	
	public QueueStatic() {
		size = 100;
		sizeControl = 0;
		cola = (T[]) new Object [size];
		
	}      

	
	
	public void enqueue(T element) {
		
		if(sizeControl>size){
			enqueue(element);
		}else {
		cola[sizeControl] = element;
		sizeControl++;
		}
	}  

	
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

	
	public T front() throws EmptyQueueException {
		if (isEmpty()) {
			throw new EmptyQueueException("Esta cola esta vacia");
		}else {
		
		return cola[0];
		}
	}

	
	public boolean isEmpty() {
		
		return sizeControl==0;
	}

	
	public int size() {
		return sizeControl;
	}
	

}
