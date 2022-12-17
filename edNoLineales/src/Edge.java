

/**
 * This class represents the basic functional behavior of an edge in a graph.
 * @author Victor Centellas, David Garcia, Andrea Ordono, German Pajarero
 * @date December 2022
 * @version 1.0
 */

public interface Edge<E> {
  /**
   * This method returns the ID of the edge.
   * @return The string defining the ID.
   */
  public String getID();

  /**
   * This method returns the element in the edge or null if
   * the edge stores nothing.
   * @return The element in the edge
   */
  public E getElement();
}
