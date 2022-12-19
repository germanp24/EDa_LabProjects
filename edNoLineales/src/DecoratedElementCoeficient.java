import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * It's a class that implements the Element interface and it's used to decorate
 * the vertices of a graph.
 * 
 * @author Victor Centellas, David Garcia, Andrea Ordono, German Pajarero
 * @date December 2022
 * @version 1.0
 */

public class DecoratedElementCoeficient<T> implements Element {

	private String ID;

	private boolean visited;
	private T element;
	private DecoratedElementCoeficient<T> parent;
	private int distance;

/**It's a constructor that initializes the variables of the class.
*/
	public DecoratedElementCoeficient(T element) {

		ID = String.valueOf(element);
		visited = false;
		distance = 0;
		parent = null;
		this.element = element;

	}

/**
 * Returns the parent of this element.
 * 
 * @return The parent of the current node.
 */
	public DecoratedElementCoeficient<T> getParent() {
		return parent;
	}

/**
 * This function sets the parent of the current node to the node passed in as a parameter.
 * 
 * @param parent The parent of the current node.
 */
	public void setParent(DecoratedElementCoeficient<T> parent) {
		this.parent = parent;
	}

/**
 * This function returns the ID of the current object
 * 
 * @return The ID of the student.
 */
	public String getID() {
		return ID;
	}

/**
 * This function sets the ID passed in as a parameter.
 * 
 * @param iD The ID of the user.
 */
	public void setID(String iD) {
		ID = iD;
	}

/**
 * This function returns the value of the visited variable
 * 
 * @return The boolean value of the visited variable.
 */
	public boolean isVisited() {
		return visited;
	}

/**
 * This function sets the visited variable to the value of the parameter
 * 
 * @param visited This is a boolean value that indicates whether the node has been visited or not.
 */
	public void setVisited(boolean visited) {
		this.visited = visited;
	}

/**
 * This function returns the distance of the current node from the root node
 * 
 * @return The distance of the object.
 */
	public int getDistance() {
		return distance;
	}

/**
 * This function sets the distance of the current object to the value of the parameter
 * 
 * @param distance The distance from the starting node to the current node.
 */
	public void setDistance(int distance) {
		this.distance = distance;
	}

/**
 * This function sets an element
 * 
 * @param element The element to be stored in the node.
 */
	public void setElement(T element) {
		this.element = element;
	}

/**
 * Returns the element stored in this node
 * 
 * @return The element of the node.
 */
	public T getElement() {
		return element;
	}

/**
 * It compares the ID of the current node with the ID of the node passed as a parameter.
 * 
 * @param n the object to compare to
 * @return The ID of the DecoratedElementCoeficient.
 */
	public boolean equals(Object n) {
		return ID.equals(((DecoratedElementCoeficient<T>) n).getID());
	}

/**
 * The function returns a string representation of the element in the node
 * 
 * @return The element of the node.
 */
	public String toString() {
		return element.toString();
	}

/**
 * It returns an ArrayList of the most sociable characters in the graph.
 * 
 * @param g the graph
 * @param personajeMasSociable The vertex with the highest degree
 * @return An ArrayList of DecoratedElementCoeficient
 */
	public static ArrayList masSociables(TreeMapGraph g, Vertex<DecoratedElementCoeficient> personajeMasSociable) {
		ArrayList personajesMasSociables = new ArrayList();
		personajesMasSociables.add(personajeMasSociable.getElement());
		Iterator gradoVertice = g.incidentEdges(personajeMasSociable);
		int gradoCadaVertice = 0;
		int gradoVerticeMax = 0;
		while (gradoVertice.hasNext()) {
			gradoVertice.next();
			gradoVerticeMax++;
		}

		Vertex<DecoratedElementCoeficient> personajeaux;

		Iterator<Vertex<DecoratedElementCoeficient>> itAux;
		itAux = g.getVertices();
		Iterator<Edge> it;
		while (itAux.hasNext()) {
			it = g.incidentEdges(personajeaux = itAux.next());

			while (it.hasNext()) {
				it.next();
				gradoCadaVertice++;

			}

			if (gradoCadaVertice == gradoVerticeMax) {
				if (!(personajeaux.equals(personajeMasSociable))) {
					personajesMasSociables.add(personajeaux.getElement());
				}

			}
			gradoCadaVertice = 0;
		}
		return personajesMasSociables;

	}

/**
 * It returns the vertex with the highest degree
 * 
 * @param g the graph
 * @return The vertex with the highest degree.
 */
	public static Vertex<DecoratedElementCoeficient> masSociable(TreeMapGraph g) {
		int gradoCadaVertice = 0;
		int gradoVerticeMax = 0;
		Vertex<DecoratedElementCoeficient> personaje = null, personajeaux;
		Iterator<Vertex<DecoratedElementCoeficient>> itAux;
		itAux = g.getVertices();
		Iterator<Edge> it;
		while (itAux.hasNext()) {
			it = g.incidentEdges(personajeaux = itAux.next());

			while (it.hasNext()) {
				it.next();
				gradoCadaVertice++;
			}

			if (gradoCadaVertice > gradoVerticeMax) {

				gradoVerticeMax = gradoCadaVertice;

				personaje = personajeaux;

			}
			gradoCadaVertice = 0;

		}

		return personaje;
	}

/**
 * This function returns an ArrayList of the characters that have the least number of relationships
 * 
 * @param g the graph
 * @param personajeMenosSociable The vertex with the least number of edges
 * @return An ArrayList of DecoratedElementCoeficient
 */
	public static ArrayList menosSociables(TreeMapGraph g, Vertex<DecoratedElementCoeficient> personajeMenosSociable) {
		ArrayList personajesMenosSociables = new ArrayList();
		personajesMenosSociables.add(personajeMenosSociable.getElement());
		Iterator gradoVertice = g.incidentEdges(personajeMenosSociable);
		int gradoCadaVertice = 0;
		int gradoVerticeMin = 0;
		while (gradoVertice.hasNext()) {
			gradoVertice.next();
			gradoVerticeMin++;
		}
		Vertex<DecoratedElementCoeficient> personajeaux;

		Iterator<Vertex<DecoratedElementCoeficient>> itAux;
		itAux = g.getVertices();
		Iterator<Edge> it;
		while (itAux.hasNext()) {
			it = g.incidentEdges(personajeaux = itAux.next());

			while (it.hasNext()) {
				it.next();
				gradoCadaVertice++;
			}
			if (gradoCadaVertice == gradoVerticeMin) {
				if (!(personajeaux.equals(personajeMenosSociable))) {
					personajesMenosSociables.add(personajeaux.getElement());
				}

			}
			gradoCadaVertice = 0;
		}
		return personajesMenosSociables;

	}

/**
 * It returns the vertex with the least number of edges
 * 
 * @param g The graph
 * @return The vertex with the least number of edges.
 */
	public static Vertex<DecoratedElementCoeficient> menosSociable(TreeMapGraph g) {
		int l = 0;
		int aux = 10000;
		Vertex<DecoratedElementCoeficient> personaje = null, personajeaux;
		Iterator<Vertex<DecoratedElementCoeficient>> itAux;
		itAux = g.getVertices();
		Iterator<Edge> it;
		while (itAux.hasNext()) {
			it = g.incidentEdges(personajeaux = itAux.next());

			while (it.hasNext()) {
				it.next();
				l++;
			}
			if (l < aux) {
				aux = l;
				l = 0;
				personaje = personajeaux;

			}
		}

		return personaje;
	}

/**
 * This function returns an iterator of the edges of a graph sorted by weight
 * 
 * @param g The graph
 * @param u The vertex from which we want to get the edges.
 * @return An iterator of the edges of the graph.
 */
	public static Iterator ordenacionMayorPesos(TreeMapGraph g, Vertex<DecoratedElementCoeficient> u) {
		ArrayList aristas = new ArrayList();
		Iterator<Edge> it;
		it = g.incidentEdges(u);

		while (it.hasNext()) {

			aristas.add(it.next());
		}
		Collections.sort(aristas, new Comparator<Edge>() {

			@Override
			public int compare(Edge o1, Edge o2) {
				return new Integer((int) o2.getElement()).compareTo((int) o1.getElement());
			}

		});
		return aristas.iterator();
	}

/**
 * It takes a graph and a vertex and returns an iterator of the edges of the graph sorted by weight
 * 
 * @param g The graph
 * @param u The vertex from which we want to get the edges.
 * @return An iterator of edges.
 */
	public static Iterator ordenacionMenorPesos(TreeMapGraph g, Vertex<DecoratedElementCoeficient> u) {
		ArrayList aristas = new ArrayList();
		Iterator<Edge> it;
		it = g.incidentEdges(u);

		while (it.hasNext()) {

			aristas.add(it.next());
		}
		Collections.sort(aristas, new Comparator<Edge>() {

			@Override
			public int compare(Edge o1, Edge o2) {
				return new Integer((int) o1.getElement()).compareTo((int) o2.getElement());
			}

		});
		return aristas.iterator();
	}

/**
 * It takes a graph, a source vertex, a target vertex, and an empty array list as input, and returns the length of the shortest path
 * from the source to the target vertex
 * 
 * @param g The graph
 * @param s source vertex
 * @param t the target vertex
 * @param secuencia is an ArrayList that will contain the path from the source to the target.
 * @return The length of the path from s to t.
 */
	public static int pathBFS(TreeMapGraph g, Vertex<DecoratedElementCoeficient> s,
			Vertex<DecoratedElementCoeficient> t, ArrayList secuencia) {
		Queue<Vertex<DecoratedElementCoeficient>> q = new LinkedList();
		int pesoMin=100000;
		int pesoCadaRecorrido=0;
		boolean noEnd = true;
		Vertex<DecoratedElementCoeficient> u, v;

		DecoratedElementCoeficient el;
		Edge e;
		Iterator<Edge> itaux;
		int l = 0;
		Iterator<Vertex<DecoratedElementCoeficient>> itAux;
		itAux = g.getVertices();
		while (itAux.hasNext()) {
			el = itAux.next().getElement();
			el.setVisited(false);
			el.setDistance(0);
		}
		s.getElement().setVisited(true);
		q.offer(s);

		while (!q.isEmpty() && noEnd) {
			u = q.poll();

			itaux = ordenacionMenorPesos(g, u);

			while (itaux.hasNext() && noEnd) {

				e = itaux.next();
				
				v = g.opposite(u, e);
				
				if (!(v.getElement()).isVisited()) {
					(v.getElement()).setVisited(true);
					(v.getElement()).setDistance(((u.getElement()).getDistance()) + 1);
					(v.getElement()).setParent(u.getElement());
					
					
					q.offer(v);

					noEnd = !(v.getElement().equals(t.getElement()));
				}
			}
		}
		if (!noEnd) {
			DecoratedElementCoeficient z = t.getElement();
			while (!(z.getParent() == null)) {
				secuencia.add(z);
				z = z.getParent();

			}
			secuencia.add(s.getElement());

			l = t.getElement().getDistance();
		} else {
			l = -1;
		}
		return l;

	}

/**
 * It resets the graph to its original state
 * 
 * @param g the graph
 */
	public static void resetGraph(TreeMapGraph g) {
		Iterator<Vertex<DecoratedElementCoeficient>> itAux;
		itAux = g.getVertices();
		DecoratedElementCoeficient el;
		while (itAux.hasNext()) {
			el = itAux.next().getElement();
			el.setVisited(false);
			el.setDistance(0);
		}

	}

	

/**
 * The DFS path is performed by obtaining all the paths from character 1 to character 2 with the lowest possible weight using
 * the dijkstra algorithm.
 * 
 * @param g The graph
 * @param v the vertex from which we start the search
 * @param u the vertex we're looking for
 * @param cola Queue
 * @param find boolean that indicates if the path has been found
 * @return The method returns a boolean value that indicates if there is a path between two vertices.
 */
	public static boolean pathDFS(TreeMapGraph g, Vertex<DecoratedElementCoeficient> v,
			Vertex<DecoratedElementCoeficient> u, Queue cola,boolean find) {
		cola.offer(v);
		Edge e = null;
		Stack<Edge> pila = new Stack();
		Vertex<DecoratedElementCoeficient> w;
		v.getElement().setVisited(true); 
		Iterator<Edge> it = ordenacionMayorPesos(g, v);
		
		while (it.hasNext()) { 
			e = it.next();
			if((int)e.getElement()<=10) {
			pila.push(e);
			}
		}
		while (!pila.isEmpty() && !find) {
			e =  pila.pop(); 
			w = g.opposite(v,e); 
			
			if (g.areAdjacent(v, u)) { 
				
				find=true;
			}else if(w.getElement().equals(u.getElement())){
				
				 find=true;
				 
			} else if (!(w.getElement().isVisited() && !(w.getElement().equals(u.getElement()))) ) {
			
				
				find = pathDFS(g, w, u, cola,find); 
			
		}
	}
	
		return find; 
	 
}
}