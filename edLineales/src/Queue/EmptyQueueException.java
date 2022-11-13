package Queue;

/**
 * The "EmptyQueueException" class is responsible for throwing an exception
 * when any "not possible" option is performed on a queue.
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: October 17, 2022
 * @version: 1.0
 */

public class EmptyQueueException extends RuntimeException{

/**
 * A constructor that receives a string as a parameter and calls the constructor
 * of the superclass (RuntimeException) with the same parameter.
 * @param e
 */
	public EmptyQueueException(String e) {
		super(e);
	}
}