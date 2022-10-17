package edLineales2022_23;

public class DynamicStack<T> implements Stack<T> {
protected Node<T> top;
protected int size=0;
public DynamicStack() {
	top=null;
}



@Override
public void push(T element) {
	// TODO Auto-generated method stub
	Node<T> aux= new Node<T> (element,top);
	top=aux;
	size++;
	}

@Override
public int size() {
	// TODO Auto-generated method stub
	return size;
}

@Override
public boolean isEmpty() {
	boolean isEmpty=true;
	if(size>=0) {
		isEmpty=false;
	}
	return isEmpty;
	}


@Override
public T pop() throws StackEmptyException {
	T element;
	if(top==null) {
		throw new StackEmptyException("Empty Stack");

	}else {
		element=top.getElemento();
		top=top.getSiguiente();
		size--;
	}
	return element;
}

@Override
public T top() throws StackEmptyException {
	T element;
	if(top==null) {
		throw new StackEmptyException("Empty Stack");
	}else {
	
	return top.getElemento();
	}
}

}
