<<<<<<< HEAD:edLineales2022_23/StackInterface.java
package edLineales2022_23;

public interface StackInterface <T> {

    //Lookout how to do JAVADOC

    public void push (T element);
    public T pop ();
    public T top ();
    public boolean IsEmpty();
    public int size();
    public String toString();
}
=======
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
>>>>>>> 4caebb9f02a8eadc8c6f58f751422f30bceba6ec:edLineales2022_23/Stack.java
