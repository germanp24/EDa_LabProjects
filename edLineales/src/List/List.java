package List;

/**
 * The "List" interface will contain the template on which we will base our lists.
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: November 7, 2022
 * @version: 1.0
 */

import List.EmptyListException;

public interface List<T> {
	
/**
 * Adds an element to the end of the list.
 * 
 * @param element The element to be added to the list.
 */
	public void add(T element);
	
/**
 * Returns true if the stack is empty, false otherwise.
 * 
 * @return A boolean value.
 */
	public boolean isEmpty();
	
/**
 * Returns the number of elements in this list.
 * 
 * @return The size of the list.
 */
	public int size();
	
/**
 * It checks if the list exists.
 * 
 * @param element The element to be searched for in the list.
 * @return A boolean value.
 */
	public boolean exists(T element) throws EmptyListException;
	
	/**
	 * Get the nth element of the list, or throw an exception if the list is empty.
	 * 
	 * @param n The index of the element to be returned.
	 * @return The element at the nth position in the list.
	 */
	public T get(int n) throws EmptyListException;
	
/**
 * It inserts an element into the list.
 * 
 * @param element The element to be inserted into the heap.
 * @param n The number of times the element is to be inserted.
 */
	public void put(T element, int n);
	
	/**
	 * Remove the nth element from the list.
	 * 
	 * @param n the index of the element to be removed
	 */
	public void remove (int n) throws EmptyListException;
	
/**
 * * Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element
 * 
 * @param element The element to be located.
 * @return The index of the element in the list.
 */
	public int locate(T element) throws EmptyListException;
}