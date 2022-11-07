package listas;

public class listaEstatica<T> implements Lista<T> {
	
	
	private T [] list;
	private T [] aux;
	
	private int top;
	
	public listaEstatica() {
		top = 0;
		list = (T[]) new Object [100];
	}
	
	

	@Override
	public void add(T element) {
		if(list.length>top) {
			
			list = (T[]) redimensionar(list);
			add(element);
			
		}
			list[top] = element;
			top++;
			
		
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.top;
	}

	@Override
	public boolean exists(T element) throws EmptyListException {
		boolean match = false;
		
		if (isEmpty()) {
			throw new EmptyListException("La lista esta vacía");
		}else {
			
			for (int i = 0; i<top; i++) {
				
				if (element == list[i]) {
					match = true;
				}
			}
			
		}
		return match;
	}

	@Override
	public T get(int n) throws EmptyListException {
		T element;
		
		if(isEmpty()) {
			throw new EmptyListException("La lista esta vacía");
			
		}else {
			
			element = list[n];
			return element;
			
		}
	
			
	}

	@Override
	public void put(T element, int n) {
		if(n<0 || n>size()) {
			
			throw new RuntimeException("El número introducido es negativo, o es mayor al tamaño de la lista");
		}else {
			for (int i = n; i<top; i++) {
				list[i+1]=list[i];
			}
			list[n]=element;
			top++;
			
		}
		
		
	}

	@Override
	public void remove(int n) throws EmptyListException {
		T element;
		
		if(isEmpty()) {
			throw new EmptyListException("La lista esta vacía");
		}else if (n<0 || n>top){
			throw new RuntimeException("El número introducido es negativo, o es mayor al tamaño de la lista");
		}else {
			element=list[n];
			for(int i =n; i<top;i++) {
				list[i]=list[i+1];
				
			}
			list[top]=null;
			top--;
			
		
		}
		
	}

	@Override
	public int locate(T element) throws EmptyListException {
		int pos;
		boolean exists=false;
		if (isEmpty()) {
			throw new EmptyListException("La lista esta vacía");
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
			throw new RuntimeException("No existe el elemento en el array");
		}
		return 0;
		
		
		
	}
	
	private Object redimensionar(Object matriz[]) {
		
		aux = (T[]) new Object [list.length*2];
		
		for (int i = 0; i<matriz.length; i++) {
			
			aux[i]= (T)matriz[i];
			
		}
		return aux;
	}

	
	
	
}
