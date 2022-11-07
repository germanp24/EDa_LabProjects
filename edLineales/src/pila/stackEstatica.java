package pila;




public class stackEstatica<T> implements pila<T>{
	
	private int size;
	private T[] pila;
	private T[] aux;
	private int top;
	
	
	
	//Constructor
	
	public stackEstatica() {
	
		size=100;
		this.top =0;
		pila = (T[]) new Object [size];
		
		
		
	}

	@Override
	public T pop() throws EmptyStackException {
		
		
		if(isEmpty()) { //Comprobar que la pila tiene elementos
			
			throw new EmptyStackException("La pila está vacía");
			
			
			
		
		}else {
			top--;
			return pila[top];  //disminuamos el tamaño de la pila
			
		} 
		
		
		
	
	}
	
	public T top() throws EmptyStackException {
		
		if (isEmpty()) {
			throw new EmptyStackException("La pila está vacía");
			
		}else {
			
			return pila[top-1];
		}
		
	}

	@Override
	public boolean isEmpty() throws EmptyStackException {
		
		return top == 0;
	}

	@Override
	public int size() {
		
		return top;
	}


	@Override
	public void push(T element) throws ArrayIndexOutOfBoundsException{  
		
		if(top>size) {
			redimensionar(pila);
			push(element);
			
		}else if (top<size) {
		pila[top] = element;  //Introducimos un valor, que se guardará en el siguiente lugar de la pila
		top++;
		}else {
			throw new ArrayIndexOutOfBoundsException("El indice de la pila es mayor a su tamaño");
		}
		
		
	}
	private Object redimensionar(Object matriz[]) {
		
		aux = (T[]) new Object [size*2];
		
		for (int i = 0; i<matriz.length; i++) {
			
			aux[i]= (T)matriz[i];
			
		}
		return aux;
	}

	


	
	
	

}
