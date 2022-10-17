package edLineales2022_23;

public class ejemplo {
public static void main(String[] args) throws StackEmptyException {
	Stack<Integer> pila = new StaticStack<Integer>();
pila.push(1);
System.out.println(pila.top());
pila.push(2);
pila.push(3);
System.out.println(pila.pop());
System.out.println(pila.top());




}
}
