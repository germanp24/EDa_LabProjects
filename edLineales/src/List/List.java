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
	
	public void add(T element);
	
	public boolean isEmpty();
	
	public int size();
	
	public boolean exists(T element) throws EmptyListException;
	
	public T get(int n) throws EmptyListException;
	
	public void put(T element, int n);
	
	public void remove (int n) throws EmptyListException;
	
	public int locate(T element) throws EmptyListException;
}