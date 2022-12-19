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

	public DecoratedElementCoeficient(T element) {

		ID = String.valueOf(element);
		visited = false;
		distance = 0;
		parent = null;
		this.element = element;

	}

	public DecoratedElementCoeficient<T> getParent() {
		return parent;
	}

	public void setParent(DecoratedElementCoeficient<T> parent) {
		this.parent = parent;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public T getElement() {
		return element;
	}

	public boolean equals(Object n) {
		return ID.equals(((DecoratedElementCoeficient<T>) n).getID());
	}

	public String toString() {
		return element.toString();
	}

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
