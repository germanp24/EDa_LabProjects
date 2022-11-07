package Stack;

import Stack.EmptyStackException;
import Stack.Nodo;


public class StackDynamic<T> implements Stack<T>{
	
	
	private Nodo<T> top;
	private int size;
	
	public StackDynamic() {
		top = null;
		size=0;
	}
	
	
	public void push(T element) {
		
		Nodo<T> aux = new Nodo<>(element, top);
        top = aux;
        this.size++;
    
		
		
	}

	public T pop() throws EmptyStackException {
		
		if (isEmpty()) {
            throw new EmptyStackException("Esta pila esta vacia");
        } else {
            T element = top.getElement();
            Nodo<T> aux = top.getNext();
            
            top = aux; 
            this.size--;
            return element;
        }
	}
	
	public T top() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("Esta pila esta vacia");
			
		}else {
			
			 return top.getElement();
		}
		
	}
	
	public int size() {
		
		return this.size;
	}

	
	public boolean isEmpty() throws EmptyStackException {
	
		return top == null;
	}



	public Nodo<T> getTop() {
		return top;
	}



	public void setTop(Nodo<T> top) {
		this.top = top;
	}



	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	
	




	
	
}
	
	


