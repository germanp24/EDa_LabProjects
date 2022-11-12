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

	public EmptyStackException(String e){
		super(e);
	}
}