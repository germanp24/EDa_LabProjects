
public class Nodo {
	 //Declaracion de atributos
	 private int dato;
	 private Nodo next;
	 
	 //Constructor
	 public Nodo(int dato){
	 this.dato=dato;
	 }
	 
	 //Metodos getter and setters
	 public int getDato() 
	 {
	 return dato;
	 }
	 public void setDato(int dato) 
	 {
	 this.dato = dato;
	 }
	 public Nodo getNext() 
	 {
	 return next;
	 }
	 public void setNext(Nodo next) 
	 {
	 this.next = next;
	 }
	 
	 //Metodo toString
	 public String toString()
	 {
	 String s=" "+dato+" ";
	 return s;
	 }
}
