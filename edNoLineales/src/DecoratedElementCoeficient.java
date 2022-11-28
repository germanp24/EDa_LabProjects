
public class DecoratedElementCoeficient<T> implements Element {

	private String ID;
	private boolean visited;
	private T element;
	private DecoratedElementCoeficient<T> parent;
	private int distance;

	public DecoratedElementCoeficient(String key, T element) {
		this.element = element;
		ID = key;
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
		return (ID.equals(((DecoratedElementCoeficient) n).getID())
				&& element.equals(((DecoratedElementCoeficient<T>) n).getElement()));
	}
    public String toString(){
        return element.toString();
    }
    public DecoratedElementCoeficient<T> pathBFS(TreeMapGraph g, Vertex<DecoratedElementCoeficient>s,Vertex<DecoratedElementCoeficient>t){
    	DecoratedElementCoeficient element =null;
		return element;
    	
    }
}