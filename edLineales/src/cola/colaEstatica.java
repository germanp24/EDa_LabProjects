package cola;



public class colaEstatica<T> implements queue<T>{
	
	private int size;
	private T[] cola;
	private T[] aux;
	private int sizeControl;
	
	
	public colaEstatica() {
		size = 100;
		sizeControl = 0;
		cola = (T[]) new Object [size];
		
	}

	
	
	@Override
	public void enqueue(T element) {
		
		if(sizeControl>size){
			cola = (T[]) redimensionar(cola);
			enqueue(element);
		}else {
		cola[sizeControl] = element;
		sizeControl++;
		}
	}  

	@Override
	public T dequeue() throws EmptyQueueException {
		
		if(isEmpty()) {
			throw new EmptyQueueException("La cola está vacía");
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

	@Override
	public T front() throws EmptyQueueException {
		if (isEmpty()) {
			throw new EmptyQueueException("La cola está vacía");
		}else {
		
		return cola[0];
		}
	}

	@Override
	public boolean isEmpty() {
		
		return sizeControl==0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return sizeControl;
	}
	
	private Object redimensionar(Object matriz[]) {
		
		aux = (T[]) new Object [size*2];
		
		for (int i = 0; i<matriz.length; i++) {
			
			aux[i]= (T)matriz[i];
			
		}
		return aux;
	}

}
