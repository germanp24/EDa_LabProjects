package edLineales2022_23;

public class ejemplo {
public static void main(String[] args) throws StackEmptyException {
	Stack<Integer> pila = new StaticStack<Integer>();
	System.out.println(pila.isEmpty());
pila.push(1);
System.out.println(pila.top());
pila.push(2);
pila.push(3);
System.out.println(pila.pop());
System.out.println("El tamaño de la pila es: "+pila.size());
System.out.println(pila.top());
System.out.println(pila.isEmpty());
System.out.println(pila.pop());
System.out.println(pila.isEmpty());
System.out.println(pila.pop());
System.out.println(pila.isEmpty());
System.out.println(" \n //DINAMICA \n");


Stack<Integer> piladinamica = new DynamicStack<Integer>();

piladinamica.push(1);
System.out.println(piladinamica.top());
piladinamica.push(2);
piladinamica.push(3);
System.out.println(piladinamica.pop());
System.out.println("El tamaño de la pila dinamica es: "+piladinamica.size());
System.out.println(piladinamica.top());
System.out.println(piladinamica.isEmpty());
System.out.println(piladinamica.pop());
System.out.println(piladinamica.isEmpty());
System.out.println(piladinamica.pop());
System.out.println(piladinamica.isEmpty());

}
}
