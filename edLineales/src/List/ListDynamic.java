package List;

import List.ElementDoesNotExistException;
import List.EmptyListException;

/**
 * The "ListDynamic" class will be used to perform the operation of a dynamic list,
 * it implements the "List" interface, used as a template for this class.
 * 
 * In this class the different methods that will make possible its correct
 * operation will be defined and developed.
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: November 7, 2022
 * @version: 1.0
 */

public class ListDynamic<T> implements List<T> {
	private Nodo<T> first;
	private Nodo<T> last;

	private int size;

/**
 * The constructor of the class, it is used to initialize the variables of the class.
 */
	public ListDynamic() {
		first = null;
		last = null;
		size = 0;
	}
	
/**
 * If the list is empty, then the new node is the first and last node. If the list has one element, then the new node is the last
 * node. If the list has more than one element, then the new node is the last node
 * 
 * @param element The element to be added to the list.
 */
	public void add(T element) {
		Nodo<T> aux = new Nodo(element, null);

		if (isEmpty()) {
			first = aux;
			last = aux;
			
		} else {
			
				if(!exists(element)) {
			
			if (size() == 1) {
				first.setNext(aux);
			} else {
				last.setNext(aux);
			}
			last = aux;

		}else {
			throw new ElementDoesNotExistException("El elemento que quieres introducir ya esta en la lista");
		}
	}
		
		size++;
	}
	
/**
 * Returns true if the stack is empty, false otherwise
 * 
 * @return The size of the queue
 */
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}
	
/**
 * Returns the number of elements in the list
 * 
 * @return The size of the array.
 */
	public int size() {
		return size;
	}
	

/**
 * It checks if the element exists in the list
 * 
 * @param element The element to be searched for.
 * @return The method returns a boolean value.
 */
	public boolean exists(T element) throws EmptyListException {
		boolean match = false;
		if (isEmpty()) {

			throw new EmptyListException("La lista esta vacia");
		} else {

			Nodo<T> aux = new Nodo();
			aux=first;
			for (int i = 0; (i < size()) && !match; i++) {
				
			
				if (((Diccionario)aux.getElement()).equal(element)) {
					match = true;
					
				} else {
					if (aux.getNext() != null) {
						aux = aux.getNext();
						
					}
				}
			}
			return match;
		}
	}
	
/**
 * It returns the element at the nth position of the list
 * 
 * @param n the index of the element to be returned
 * @return The element of the node in the position n.
 */
	public T get(int n) throws EmptyListException {

		if ((n < 0 || n >= size())) {
			throw new RuntimeException("El numero introducido es negativo, o es mayor al tamano de la lista");
		} else if (isEmpty()) {
			throw new EmptyListException("La lista esta vacia");

		} else {

			Nodo<T> aux = first;

			if (n == 0) {
				return aux.getElement();

			} else {
				for (int i = 0; i < n; i++) {
					aux = aux.getNext();

				}

				return aux.getElement();
			}
		}
	}

	
/**
 * It takes an element and an integer as parameters, and inserts the element at the position specified by the integer
 * 
 * @param element The element to be added to the list.
 * @param n The position where the element will be inserted.
 */
	public void put(T element, int n) {
		if ((n < 0 || n >= size())) {
			throw new RuntimeException("El numero introducido es negativo, o es mayor al tamano de la lista");
		} else {
			if (n == 0) {
				Nodo<T> aux2 = new Nodo(element, first);
				first = aux2;

			} else {
				Nodo<T> aux = new Nodo(element, null);
				Nodo<T> prev = new Nodo();
				aux = first;
				for (int i = 0; i < n; i++) {
					prev = aux;
					aux = aux.getNext();

				}
				Nodo<T> aux2 = new Nodo(element, aux);
				prev.setNext(aux2);
			}
			size++;
		}
	}
	
/**
 * This function removes an element from the list.
 * 
 * @param n The index of the element to be removed.
 */
	public void remove(int n) throws EmptyListException {
		if (isEmpty()) {
			throw new EmptyListException("La lista esta vacia");

		} else if ((n < 0 || n >= size())) {
			throw new RuntimeException("El numero introducido es negativo, o es mayor al tamano de la lista");

		} else {
			Nodo<T> aux = new Nodo();
			Nodo<T> prev = new Nodo();
			if (size() > 1) {
				if (n == 0) {
					first = first.getNext();
					if (first == null) {
						last = null;
					}
				} else {
					aux = first;
					for (int i = 0; i < n; i++) {
						prev = aux;
						aux = aux.getNext();
					}
					prev.setNext(aux.getNext());

					if (last == aux) {
						last = prev;
						aux = null;
					}
				}

			} else {
				first = null;
				last = null;
			}
		}
		size--;
	}

/**
 * It returns the index of the first element in the list that matches the element passed as a parameter
 * 
 * @param element The element to be located.
 * @return The position of the element in the list.
 */
	public int locate(T element) throws EmptyListException {
		int n = 0;
		
	
		boolean match = false;
		if (isEmpty()) {
			throw new EmptyListException("Esta lista esta vacia");

		} else {
			Nodo<T> aux = new Nodo();
			aux=first;
			for (int i = 0; (i < size()) && !match; i++) {
				
			
				if (((Diccionario)aux.getElement()).equal(element)) {
					
					n = i;
					match = true;
					
				} else {
					if (aux.getNext() != null) {
						aux = aux.getNext();
						
					}
				}
			}
			if (match) {
				return n;

			} else {
				throw new ElementDoesNotExistException("Este elemento no existe");
			}
		}
	}
}