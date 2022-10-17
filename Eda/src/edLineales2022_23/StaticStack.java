package edLineales2022_23;

public class StaticStack<T> implements Stack<T> {
	
	  int t;
	  T [] arr =(T[])new Object[5];

public StaticStack(){
	t=-1;

}
public void push(T element) {
	
	 this.arr[++t] =  element ;
	
}
public T pop() throws StackEmptyException {
	if(isEmpty()) {
		throw new StackEmptyException("The stack is empty. Push a value before popping it.");
	}else{
		this.arr[t]=null;
		t--;
		return this.arr[t];
	}
	
	
	
}

public int size() {
 return t+1;
	
}

public boolean isEmpty() {
	boolean isEmpty=true;
	if(t>=0) {
		isEmpty=false;
	}
	return isEmpty;
	}
@Override
public T top() throws StackEmptyException{
	// TODO Auto-generated method stub
	return this.arr[t];
}


}

