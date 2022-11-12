package List;

/**
 * The "ElementDoesNotExistException" exception contains the
 * exception handling for when the element does not exist.
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: November 7, 2022
 * @version: 1.0
 */

public class ElementDoesNotExistException extends RuntimeException {

	public ElementDoesNotExistException(String e) {
		super(e);
	}
}