package listas;

public class listaDinamica<T> implements Lista<T> {
	private node<T> first;
	private node<T> last;

	private int size;

	public listaDinamica() {
		first = null;
		last = null;
		size = 0;
	}

	@Override
	public void add(T element) {
		node<T> aux = new node(element, null);

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

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public int size() {

		return size;
	}

	@Override
	public boolean exists(T element) throws EmptyListException {
		boolean match = false;

		if (isEmpty()) {

			throw new EmptyListException("La lista está vacía");
		} else {

			node<T> aux = new node(element, null);
			first = aux;

			while ((aux.getNext() != null) && !match) {
				match = (element == aux.getElement());
				aux = aux.getNext();
			}

			return match;
		}

	}

	@Override
	public T get(int n) throws EmptyListException {

		if ((n < 0 || n >= size())) {
			throw new RuntimeException("El número introducido es negativo, o es mayor al tamaño de la lista");
		} else if (isEmpty()) {
			throw new EmptyListException("La lista está vacía");

		} else {

			node<T> aux = first;

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

	@Override
	public void put(T element, int n) {
		if ((n < 0 || n >= size())) {
			throw new RuntimeException("El número introducido es negativo, o es mayor al tamaño de la lista");
		} else {
			if (n == 0) {
				node<T> aux2 = new node(element, first);
				first = aux2;

			} else {
				node<T> aux = new node(element, null);
				node<T> prev = new node();
				aux = first;
				for (int i = 0; i < n; i++) {
					prev = aux;
					aux = aux.getNext();

				}
				node<T> aux2 = new node(element, aux);
				prev.setNext(aux2);

			}
			size++;
		}

	}

	@Override
	public void remove(int n) throws EmptyListException {
		if (isEmpty()) {
			throw new EmptyListException("La lista está vacía");

		} else if ((n < 0 || n >= size())) {
			throw new RuntimeException("El número introducido es negativo, o es mayor al tamaño de la lista");

		} else {
			node<T> aux = new node();
			node<T> prev = new node();
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

	@Override
	public int locate(T element) throws EmptyListException {
		int n = 0;
		boolean match = false;
		if (isEmpty()) {
			throw new EmptyListException("La lista está vacía");

		} else {
			node<T> aux = new node();
			aux = first;
			for (int i = 0; (i < size()) && (n == 0); i++) {

				if (aux.compareTo(element)) {
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
				throw new ElementDoesNotExistException("El elemento no existe");
			}
		}

	}

}
