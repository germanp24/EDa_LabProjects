import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.UUID;

/**
 * The "Main" class is the class from which we are going to carry out the main
 * functionality of the program, using the previously created classes and
 * according to the provided statement.
 * 
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: December 2022
 * @version: 1.0
 */

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Scanner read = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		TreeMapGraph Grafo = new TreeMapGraph();

		String p1 = null, p2 = null;
		int peso = 0;
		DecoratedElementCoeficient<String> P1;
		DecoratedElementCoeficient<String> P2;
		Vertex<DecoratedElementCoeficient> V1;
		Vertex<DecoratedElementCoeficient> V2;
		
		Scanner sc = new Scanner(new File("C:\\Users\\Victo\\git\\EDA\\edNoLineales\\marvel-unimodal-edges.csv"));
		// Es posible que para la entrega haya que modificar la ruta de la linea anterior (?)
		
		sc.nextLine();
		boolean nombre = false;
		while (sc.hasNextLine()) {

			String[] tokens = sc.nextLine().split(",");

			if (tokens.length == 3) {
				p1 = tokens[0];

				p2 = tokens[1];
				peso = Integer.parseInt(tokens[2]);
			} else if (tokens.length == 4) {
				
					if (tokens[0].charAt(0) == '"') {

						nombre = true;
					}
					
					if (nombre) {

						p1 = tokens[0] + "," + tokens[1];

						p2 = tokens[2];
						peso = Integer.parseInt(tokens[3]);
					} else {
						p1 = tokens[0];
						p2 = tokens[1] + "," + tokens[2];
						peso = Integer.parseInt(tokens[3]);
					}
					nombre = false;
				

			} else if (tokens.length == 5) {
				p1 = tokens[0] + "," + tokens[1];
				p2 = tokens[2] + "," + tokens[3];
				peso = Integer.parseInt(tokens[4]);
			} else {
				System.out.println("Error");
				System.exit(0);
			}
			 P1 = new DecoratedElementCoeficient(p1);
			 P2 = new DecoratedElementCoeficient(p2);

			Grafo.insertEdge(P1, P2, (int) peso);

		}

		sc.close();

		

		int casos = menu();
		while (casos > 0) {
			switch (casos) {
			case 1:
				System.out.println(" Has seleccionado la opcion 1: Informacion del grafo");
				System.out.println("El numero de personajes del grafo es: "+Grafo.getN());
				System.out.println("El numero de relaciones entre personajes es de: "+ Grafo.getM());
				
				
				System.out.println("El/Los personaje/s mas sociable/s es: " +DecoratedElementCoeficient.masSociables(Grafo,DecoratedElementCoeficient.masSociable(Grafo)));
				System.out.println("El/Los personaje/s menos sociable/s es: "+DecoratedElementCoeficient.menosSociables(Grafo,DecoratedElementCoeficient.menosSociable(Grafo)));
				System.out.println();
				casos = menu();
				break;
			case 2:
				Stack<Vertex<DecoratedElementCoeficient>> stack = new Stack();
				DecoratedElementCoeficient.resetGraph(Grafo);
				System.out.println(" Has seleccionado la opcion 2: Recorrido con DFS");
				System.out.println("Escribe el nombre del primer personaje");
				p1 = br.readLine();
				P1 = new DecoratedElementCoeficient(p1);
				V1 = Grafo.getVertex(P1.getID());

				System.out.println("Escribe el nombre del segundo personaje");
				p2 = br.readLine();

				P2 = new DecoratedElementCoeficient(p2);
				V2 = Grafo.getVertex(P2.getID());
				
				Queue cola= new LinkedList();
			
				
				boolean find =DecoratedElementCoeficient.pathDFS(Grafo, V1, V2, cola,false);

				if (find) { 
					cola.add(V2);
					System.out.println();
					Vertex<DecoratedElementCoeficient> w;
					System.out.println("Camino: ");
					while (!cola.isEmpty()) { 
						w = (Vertex<DecoratedElementCoeficient>) cola.poll(); 
						if (cola.isEmpty()) {
							System.out.print(w.getElement()); 
						} else {
							System.out.print(w.getElement() + " - ");
						}
					}

				} else { 
					System.out.println("No hay camino");

				}
				System.out.println();

				casos = menu();
				break;
			case 3:
				ArrayList secuencia = new ArrayList();
				System.out.println("Has seleccionado la opcion 3: Recorrido con BFS");
				System.out.println("Escribe el nombre del primer personaje");
				p1 = br.readLine();
				P1 = new DecoratedElementCoeficient(p1);
				V1 = Grafo.getVertex(P1.getID());

				System.out.println("Escribe el nombre del segundo personaje");
				p2 = br.readLine();

				P2 = new DecoratedElementCoeficient(p2);
				V2 = Grafo.getVertex(P2.getID());
				int resultado=DecoratedElementCoeficient.pathBFS(Grafo, V1, V2,secuencia);
				if(resultado==-1) {
					System.out.println("No existe relacion entre " +p1 +  " y " + p2);
				}else {
				System.out.println("\nLa distancia entre " + p1 + " y " + p2 + " es de: " +resultado+"\n");
				
				Collections.reverse(secuencia);
				System.out.println("Y la secuencia entre los personajes es: " +secuencia);
				}
				System.out.println();
				casos = menu();
				break;
			case 4:
				System.exit(0);
			default:
				// falta resolver excepcion para que el programa continue y nos vuelva a pedir
				// introducir numero de operacion
				
			}
		}
	}
	
/**
 * It prints out a menu of options for the user to choose from
 * 
 * @return The method menu() is returning the value of the variable opcion.
 */
	public static int menu() {
		System.out.print("Introduce que operacion deseas realizar:\n");
		System.out.println(" 1.Info del grafo");
		System.out.println(" 2. Recorrer el grafo con el camino DFS");
		System.out.println(" 3. Recorrer el grafo con el camino BFS");
		System.out.println(" 4. Salir");
		return read.nextInt();
	}

}