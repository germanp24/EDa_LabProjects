package edLineales2022_23;

public interface Stack <T> {

	/**
	 * 
	 * @param T
	 */
	default void push(T element) {
		
	}
	default int size() {
		int size=0;
		return size;
	}

	default boolean isEmpty() {
		boolean isEmpty=false;
		
		return isEmpty ;
		
	}

	 default T pop() {
		 T pop=null;
			
			return pop;
	 }

	default T top() {
		T top=null ;
		
		return top;
	}

}