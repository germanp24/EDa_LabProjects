
public class colasEstaticas {

	//Declaración de atributos
	 private Nodo front;
	 private Nodo rear;

	 //Constructor sin parametros
	 public colasEstaticas()
	 {
	 front=null;
	 rear=null;
	 }
	 
	 //Metodo insertar
	 public void anadir(int dato)
	 {
	 Nodo i=new Nodo(dato);
	 i.setNext(null);
	 if(front==null & rear==null)
	 {
	 front=i;
	 rear=i;
	 }
	 rear.setNext(i);
	 rear=rear.getNext();
	 }
	 
	 //Metodo extraer dato
	 public int quitar()
	 {
	 int dato=front.getDato();
	 front=front.getNext();
	 return dato;
	 }
	 
	 //Metodo para comprobar que la cola no esta vacia
	 public boolean isEmpty()
	 {
	 boolean cola=false;
	 if(front==null & rear==null)
	 {
	 cola=true;
	 System.out.println("La cola esta vacia");
	 }
	 else
	 {
	 System.out.println("La cola no esta vacia");
	 cola=false;
	 }
	 return cola;
	 }
	 
	 //Metodo para contar los elementos de la cola
	 public int contar()
	 {
	 int contador=0;
	 Nodo c=this.front;
	 while(c!=null)
	 {
	 contador++;
	 c=c.getNext();
	 }
	 System.out.println("Numero de datos en la cola: "+contador);
	 return contador;
	 }
	 
	 //Metodo toString
	 public String toString()
	 {
	 Nodo c=this.front;
	 String s="";
	 while(c!=null)
	 {
	 s=s+c.toString();
	 c=c.getNext();
	 }
	 return s;
	 } 
}
