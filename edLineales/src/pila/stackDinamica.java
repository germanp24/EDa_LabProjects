package pila;



public class stackDinamica<T> implements pila<T>{
	
	//Atributos
	private node<T> top;
	private int size;
	
	//Constructor
	public stackDinamica() {
		top = null;
		size=0;
	}
	
	
	//Métodos de la pila
	@Override
	public void push(T element) {
		
		node<T> aux = new node<>(element, top);
        top = aux;
        this.size++;
    
		
		
	}

	@Override
	public T pop() throws EmptyStackException {
		
		if (isEmpty()) {
            throw new EmptyStackException("No se puede eliminar este elemento, porque no hay elementos en la pila.");
        } else {
            T element = top.getElement();
            node<T> aux = top.getNext();
            
            top = aux; 
            this.size--;
            return element;
        }
	}
	
	public T top() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("La pila está vacía");
			
		}else {
			
			 return top.getElement();
		}
		
	}
	@Override
	public int size() {
		
		return this.size;
	}

	@Override
	public boolean isEmpty() throws EmptyStackException {
	
		return top == null;
	}


	//Getters and Setters

	public node<T> getTop() {
		return top;
	}



	public void setTop(node<T> top) {
		this.top = top;
	}



	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	
	




	
	
}
	
	

