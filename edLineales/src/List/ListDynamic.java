package List;

import List.ElementDoesNotExistException;
import List.EmptyListException;

public class ListDynamic<T> implements List<T> {
	private Nodo<T> first;
	private Nodo<T> last;

	private int size;

	public ListDynamic() {
		first = null;
		last = null;
		size = 0;
	}

	
	public void add(T element) {
		Nodo<T> aux = new Nodo(element, null);

		if (isEmpty()) {
			first = aux;
			last = aux;

		} else {
			if (size() == 1) {
				first.setNext(aux);
			} else {
				last.setNext(aux);
			}
			last = aux;

		}
		size++;
	}

	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	
	public int size() {

		return size;
	}

	
	public boolean exists(T element) throws EmptyListException {
		boolean match = false;

		if (isEmpty()) {

			throw new EmptyListException("La lista está vacía");
		} else {

			Nodo<T> aux = new Nodo(element, null);
			first = aux;

			while ((aux.getNext() != null) && !match) {
				match = (element == aux.getElement());
				aux = aux.getNext();
			}

			return match;
		}

	}

	
	public T get(int n) throws EmptyListException {

		if ((n < 0 || n >= size())) {
			throw new RuntimeException("El número introducido es negativo, o es mayor al tamaño de la lista");
		} else if (isEmpty()) {
			throw new EmptyListException("La lista está vacía");

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

	
	public void put(T element, int n) {
		if ((n < 0 || n >= size())) {
			throw new RuntimeException("El número introducido es negativo, o es mayor al tamaño de la lista");
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

	
	public void remove(int n) throws EmptyListException {
		if (isEmpty()) {
			throw new EmptyListException("La lista está vacía");

		} else if ((n < 0 || n >= size())) {
			throw new RuntimeException("El número introducido es negativo, o es mayor al tamaño de la lista");

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

	
	public int locate(T element) throws EmptyListException {
		int n = 0;
		boolean match = false;
		if (isEmpty()) {
			throw new EmptyListException("Esta lista esta vacia");

		} else {
			Nodo<T> aux = new Nodo();
			aux = first;
			for (int i = 0; (i < size()) && (n == 0); i++) {

				if (aux.CompararCon(element)) {
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

