/**
 * This class is a subclass of RuntimeException that is thrown when a position is invalid
 *
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * @date: December 2022
 * @version: 1.0
 */
 
public class InvalidPositionException extends RuntimeException {
    public InvalidPositionException (String err) {
        super (err);
    }

}