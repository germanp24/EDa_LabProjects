package edLineales2022_23;

public class Node<T> {
 
    //Atributos
    private T elemento;
    private Node<T> siguiente; //Apunta al siguiente nodo
 
    //Contructor
    public Node(T elemento, Node<T> siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }
 
    //Metodos
    public T getElemento() {
        return elemento;
    }
 
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
 
    public Node<T> getSiguiente() {
        return siguiente;
    }
 
    public void setSiguiente(Node<T> siguiente) {
        this.siguiente = siguiente;
    }
 
    
    public String toString() {
        return elemento + "\n";
    }
}
 
