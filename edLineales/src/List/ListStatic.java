package List;

import List.EmptyListException;

/**
 * The "ListStatic" class will be used to perform the operation of a static list,
 * it implements the "List" interface, used as a template for this class.
 * 
 * In this class the different methods that will make possible its correct
 * operation will be defined and developed.
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: November 7, 2022
 * @version: 1.0
 */

public class ListStatic<T> implements List<T> {
	private T [] list;
	private int top;

/**
 * The constructor of the class, it is used to initialize the variables of the class.
 */
	public ListStatic() {
		top = 0;
		list = (T[]) new Object [100];
	}
	
/**
 * If the list is not full, add the element to the top of the list
 * 
 * @param element the element to be added to the stack
 */
	public void add(T element) {
		if(list.length>top) {
			add(element);
		}
			list[top] = element;
			top++;
	}

/**
 * If the top of the stack is equal to 0, then the stack is empty
 * 
 * @return The method isEmpty() returns a boolean value.
 */
	public boolean isEmpty() {
		return top == 0;
	}
	
/**
 * Returns the number of elements in the stack
 * 
 * @return The top of the stack
 */
	public int size() {
		return this.top;
	}
	
/**
 * This function checks if an element exists in the list
 * 
 * @param element The element to be searched for.
 * @return The method returns a boolean value.
 */
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
	
/**
 * This function returns the element at the specified position in this list
 * 
 * @param n the index of the element you want to get
 * @return The element in the position n of the list.
 */
	public T get(int n) throws EmptyListException {
		T element;
		
		if(isEmpty()) {
			throw new EmptyListException("Esta lista esta vacia");
			
		}else {
			
			element = list[n];
			return element;
		}
	}
	
/**
 * This function inserts an element at a given position in the list
 * 
 * @param element The element to be added to the list.
 * @param n The position where the element will be inserted.
 */
	public void put(T element, int n) {
		if(n<0 || n>size()) {
			
			throw new RuntimeException("El numero es negativo, o es mayor al tamanoo de esta lista");
		}else {
			for (int i = n; i<top; i++) {
				list[i+1]=list[i];
			}
			list[n]=element;
			top++;
		}
	}

/**
 * This function removes an element from the list, and shifts all the elements after it to the left
 * 
 * @param n The index of the element to be removed.
 */
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
	
/**
 * This function returns the position of the element in the list
 * 
 * @param element The element to be located.
 * @return The position of the element in the list.
 */
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