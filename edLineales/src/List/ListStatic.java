package List;

import List.EmptyListException;

public class ListStatic<T> implements List<T> {
	
	
	private T [] list;
	
	private int top;
	
	public ListStatic() {
		top = 0;
		list = (T[]) new Object [100];
	}
	
	

	
	public void add(T element) {
		if(list.length>top) {
			
			add(element);
			
		}
			list[top] = element;
			top++;
	}

	
	public boolean isEmpty() {
		return top == 0;
	}

	
	public int size() {
		return this.top;
	}

	
	public boolean exists(T element) throws EmptyListException {
		boolean igual = false;
		
		if (isEmpty()) {
			throw new EmptyListException("Esta lista esta vacia");
		}else {
			
			for (int i = 0; i<top; i++) {
				
				if (element == list[i]) {
					igual = true;
				}
			}
			
		}
		return igual;
	}

	
	public T get(int n) throws EmptyListException {
		T element;
		
		if(isEmpty()) {
			throw new EmptyListException("Esta lista esta vacia");
			
		}else {
			
			element = list[n];
			return element;
			
		}
	
			
	}

	
	public void put(T element, int n) {
		if(n<0 || n>size()) {
			
			throw new RuntimeException("El numero  es negativo, o es mayor al tamanoo de esta lista");
		}else {
			for (int i = n; i<top; i++) {
				list[i+1]=list[i];
			}
			list[n]=element;
			top++;
			
		}
		
		
	}

	
	public void remove(int n) throws EmptyListException {
		T element;
		
		if(isEmpty()) {
			throw new EmptyListException("La lista esta vacia");
		}else if (n<0 || n>top){
			throw new RuntimeException("El numero introducido es negativo, o es mayor al tamano de la lista");
		}else {
			element=list[n];
			for(int i =n; i<top;i++) {
				list[i]=list[i+1];
				
			}
			list[top]=null;
			top--;
			
		
		}
		
	}

	
	public int locate(T element) throws EmptyListException {
		int pos;
		boolean exists=false;
		if (isEmpty()) {
			throw new EmptyListException("La lista esta vacia");
		}else {
			for (int i=0; i<top;i++) {
				if (list[i]==element) {
					pos = i;
					exists=true;
					return pos;
					
					
				}
			}
		}
		if (!exists) {
			throw new RuntimeException("No existe el elemento en la lista");
		}
		return 0;
		
		
		
	}
	

	
	
	
}
