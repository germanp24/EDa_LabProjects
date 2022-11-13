package List;

/**
 * The "EmptyListException" exception contains the
 * exception handling for when the list is empty.
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: November 7, 2022
 * @version: 1.0
 */

public class EmptyListException extends RuntimeException{
	
/**
 * EmptyListException constructor.
 * @param err
 */	
	public EmptyListException(String err) {
		super(err);
	}
}