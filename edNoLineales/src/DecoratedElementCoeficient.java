import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * It's a class that implements the Element interface and it's used to decorate the vertices of a graph.
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

	public DecoratedElementCoeficient( T element) {
		
		ID=String.valueOf(element);
		visited = false;
		distance = 0;
		parent = null;
		this.element= element;
	
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
		return  ID.equals(((DecoratedElementCoeficient<T>) n).getID());
	}
    public String toString(){
        return element.toString();
    }
    public static Vertex<DecoratedElementCoeficient> masSociable(TreeMapGraph g) {
    	int l=0;
    	int aux=0;
    	Vertex<DecoratedElementCoeficient> personaje = null,personajeaux;
    	Iterator<Vertex<DecoratedElementCoeficient>> itAux;
		itAux=g.getVertices();
		Iterator<Edge> it;
		while(itAux.hasNext()) {
			it=g.incidentEdges(personajeaux=itAux.next());
			
			while(it.hasNext()) {
				it.next();
				l++;
			}
			if(l>aux) {
				aux=l;
				l=0;
				personaje=personajeaux;
				
			}
		}
    	
    	return personaje;
    }
    public static Vertex<DecoratedElementCoeficient> menosSociable(TreeMapGraph g) {
    	int l=0;
    	int aux=10000;
    	Vertex<DecoratedElementCoeficient> personaje = null,personajeaux;
    	Iterator<Vertex<DecoratedElementCoeficient>> itAux;
		itAux=g.getVertices();
		Iterator<Edge> it;
		while(itAux.hasNext()) {
			it=g.incidentEdges(personajeaux=itAux.next());
			
			while(it.hasNext()) {
				it.next();
				l++;
			}
			if(l<aux) {
				aux=l;
				l=0;
				personaje=personajeaux;
				
			}
		}
    	
    	return personaje;
    }
    public static int pathBFS(TreeMapGraph g, Vertex<DecoratedElementCoeficient> s,Vertex<DecoratedElementCoeficient> t){
    	Queue<Vertex<DecoratedElementCoeficient>> q = new LinkedList();
    	ArrayList aristas = new ArrayList();
    	boolean noEnd= true;
    	Vertex<DecoratedElementCoeficient> u,v;

    	DecoratedElementCoeficient el;
    	Edge e;
    	Iterator<Edge> it;
    	Iterator<Edge> itaux;
    	int l=0;
		Iterator<Vertex<DecoratedElementCoeficient>> itAux;
		itAux=g.getVertices();
		while(itAux.hasNext()) {
			el=itAux.next().getElement();
			el.setVisited(false);
			el.setDistance(0);
		}
		s.getElement().setVisited(true);
		q.offer(s);
		
		while(!q.isEmpty() && noEnd) {
			u=q.poll();
			it=g.incidentEdges(u);
			while( it.hasNext()){
				
				aristas.add(it.next());
			}
			Collections.sort(aristas, new Comparator<Edge>(){

				@Override
				public int compare(Edge o1, Edge o2) {
					return new Integer((int)o1.getElement()).compareTo((int)o2.getElement());
				}
				
			});
			itaux=aristas.iterator();
			
			while( itaux.hasNext() && noEnd) {
				
				e = itaux.next();
				
				v = g.opposite(u, e);
				if(!(v.getElement()).isVisited()) {
					(v.getElement()).setVisited(true);
					(v.getElement()).setDistance(((u.getElement()).getDistance())+1);
					q.offer(v);
					noEnd=!(v.getElement().equals(t.getElement()));
				}
			}
		}
		if(!noEnd) {
			l=t.getElement().getDistance();
		}else {
			l=-1;
		}
		return l;

    }
	public static boolean pathDFS(TreeMapGraph g, Vertex<DecoratedElementCoeficient> v,Vertex<DecoratedElementCoeficient> z,Stack<Edge> p){
    	
    	Vertex<DecoratedElementCoeficient> w;
    	Iterator<Edge> it;
    	Edge e;
    	

		boolean noEnd=(v.getElement()).equals(z.getElement())	;
		
		Iterator<Vertex<DecoratedElementCoeficient>> itAux;
		itAux=g.getVertices();
		DecoratedElementCoeficient el;
		while(itAux.hasNext()) {
			el=itAux.next().getElement();
			el.setVisited(false);
			el.setDistance(0);
		}
		v.getElement().setVisited(true);
		
			it=g.incidentEdges(v);
			while(it.hasNext() && !noEnd) {
				e = it.next();
				w=g.opposite(v, e);
				if(!(w.getElement().isVisited())) {
					p.push(e);
					w.getElement().setVisited(true);
					(w.getElement()).setDistance(((v.getElement()).getDistance())+1);

					noEnd=pathDFS(g,w,z,p);
					if(!noEnd) {
						p.pop();
					}
				}
				
			}
			return noEnd;
		
		

	    	/*Vertex<DecoratedElementCoeficient> u=null;
			Edge e=null;
			// Previsit. Optional: Do something with the node
			
			Iterator<Edge>it = g.incidentEdges(s);
			while (it.hasNext()){ //using the edges to recover
			e=it.next(); //the adjacent vertices
			u=g.opposite(s, e);
			if(!u.getElement().isVisited()){
			u.getElement().setParent(s.getElement());//Optional
			pathDFS(g, s, t);
			}
			}
			// Postvisit. Optional: Do something with the node
			 * 
			 * *
			 */
			
	}
}