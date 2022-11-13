package Stack;

/**
 * The "EmptyStackException" class is responsible for throwing an exception
 * when any "not possible" option is performed on an empty stack.
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: October 10, 2022
 * @version: 1.0
 */

public class EmptyStackException extends RuntimeException{

/**
 * A constructor that takes a string as a parameter and calls
 * the super class constructor with the same parameter.
 * @param e The String that receives the constructor
 */

	public EmptyStackException(String e){
		super(e);
	}
}