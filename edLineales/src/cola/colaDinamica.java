package cola;
/**
 * 
 * @author david
 *
 * @param <T>
 *
 */


public class colaDinamica<T> implements queue<T> {
	
	private node<T> first;
	private node<T> last;
	private int size;
	
	public colaDinamica() {
		first = null;
		last = null;
		size = 0;
	}

	@Override
	public void enqueue(T element) {
		
		node<T> aux = new node(element, null);
		
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

	@Override
	public T dequeue() throws EmptyQueueException{
		
		if (isEmpty()) {
			throw new EmptyQueueException("La cola está vacía");
		}else {
			T element = first.getElement();
			node<T> aux = first.getNext();
			
			
			first = aux;
			size--;
			if(isEmpty()) {
				last = null;
			}
			
			return element;
			
		}
		
		
	}

	@Override
	public T front() throws EmptyQueueException{
		if (isEmpty()) {
			throw new EmptyQueueException("La cola esta vacia");
		}else {
			
			return first.getElement();
		}
		
		
	}

	@Override
	public boolean isEmpty() {
		
		return first == null;
	}

	@Override
	public int size() {
	
		return size;
	}
	
	

}
