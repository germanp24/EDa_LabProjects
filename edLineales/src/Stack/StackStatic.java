package Stack;
import Stack.EmptyStackException;

public class StackStatic<T> implements Stack<T>{
	
	private int size;
	private T[] stack;
	private int top;
	
	
	
	
	public StackStatic() {
		size=100;
		this.top =0;
		stack = (T[]) new Object [size];
	}

	
	public T pop() throws EmptyStackException {
		
		
		if(isEmpty()) { 
			
			throw new EmptyStackException("Esta pila esta vacia");
		
		}else {
			top--;
			return stack[top];  
			
		} 
		
	}
	
	public T top() throws EmptyStackException {
		
		if (isEmpty()) {
			throw new EmptyStackException("Esta pila esta vacia");
			
		}else {
			
			return stack[top-1];
		}
		
	}

	
	public boolean isEmpty() throws EmptyStackException {
		
		return top == 0;
	}
	
	public int size() {
		
		return top;
	}


	
	public void push(T element) throws ArrayIndexOutOfBoundsException{  
		
		if(top>size) {
			push(element);
		}else if (top<size) {
			stack[top] = element;  
		top++;
		}else {
			throw new ArrayIndexOutOfBoundsException("El indice de esta pila es mayor al de su tamano");
		}
		
	}

}