
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

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
		System.out.println(String.valueOf(ID));
		System.out.println(((DecoratedElementCoeficient<T>) n).getID());
		return  ID.equals(((DecoratedElementCoeficient<T>) n).getID());
	}
    public String toString(){
        return element.toString();
    }
    public static int pathBFS(TreeMapGraph g, Vertex<DecoratedElementCoeficient>s,Vertex<DecoratedElementCoeficient>t){
    	Queue<Vertex<DecoratedElementCoeficient>> q = new LinkedList();
    	boolean noEnd= true;
    	Vertex<DecoratedElementCoeficient> u,v;
    	DecoratedElementCoeficient el;
    	Edge e;
    	Iterator<Edge> it;
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
			while(it.hasNext() && noEnd) {
				e=it.next();
				v=g.opposite(u, e);
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
}