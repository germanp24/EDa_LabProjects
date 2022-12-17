/**
 * This class represents the basic functional behavior of a vertex in
 * a graph.
 * @author Victor Centellas, David Garcia, Andrea Ordono, German Pajarero
 * @date November 2014
 * @version 1.0
 */
public interface Vertex <V> {
  /**
   * This method returns the ID of the node/vertex.
   * @return The string defining the ID.
   */
  public String getID();

  /**
   * This method returns the element contained in the node/vertex or null if
   * the node/vertex stores nothing.
   * @return The element in the node.
   */
  public V getElement();

}
