package Stack;

/**
 * The "Main" class is the class from which we will generate the
 * pertinent stacks and show its operation by means of examples.
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: November 7, 2022
 * @version: 1.0
 */



public class Main {
	public static void main(String[] args) {

		
		StackStatic<Integer> staticStack = new StackStatic<Integer>();
		StackDynamic<Integer> dynamicStack = new StackDynamic<Integer>();
		System.out.println("Pila dinamica: \n" );
		stack(dynamicStack);
		System.out.println("Pila estatica: \n" );
		stack(staticStack);
		
		
	}
	public static void stack(Stack pila) {

		pila.push(2);
		pila.push(3);

		System.out.println("El top de la pila es "+ pila.top());

		System.out.println("El tamaño de la pila es "+pila.size());
		
		System.out.println("Hemos quitado el elemento " +pila.pop()+" de la pila");
		System.out.println("Hemos quitado el elemento " +pila.pop()+" de la pila");

		System.out.println("¿La pila esta vacia? :"+pila.isEmpty());

		pila.push(4);
		pila.push(5);
		
		System.out.println("El top de la pila es "+ pila.top());
		System.out.println("¿La pila esta vacia? :"+pila.isEmpty()+"\n");
	}
}
