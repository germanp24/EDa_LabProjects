package List;

/**
 * The "Comparable" interface will be used to compare objects.
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: November 7, 2022
 * @version: 1.0
 */

// An interface that is used to compare two objects.
public interface Comparable<T> {

/**
 * Returns true if the element is equal to the element in the node
 * 
 * @param element The element to compare to.
 * @return A boolean value.
 */
	public boolean CompareTo(T element);
}