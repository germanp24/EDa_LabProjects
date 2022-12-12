import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.UUID;

/**
 * The "Main" class is the class from which we are going to carry out the main
 * functionality of the program, using the previously created classes and
 * according to the provided statement.
 * 
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: November 28, 2022
 * @version: 1.0
 */

public class Main {
	 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		TreeMapGraph Grafo = new TreeMapGraph();

		String p1 = null, p2 = null;
		int peso = 0;
		int key = 0;

		Scanner read = new Scanner(System.in);
		Scanner sc = new Scanner(new File("C:\\Users\\Victo\\git\\EDA\\edNoLineales\\marvel-unimodal-edges.csv"));
		sc.nextLine();
		boolean nombre = false;
		while (sc.hasNextLine()) {

			String[] tokens = sc.nextLine().split(",");

			if (tokens.length == 3) {
				p1 = tokens[0];
				p2 = tokens[1];
				peso = Integer.parseInt(tokens[2]);
			} else if (tokens.length == 4) {
				for (int i = 0; i < tokens[0].length(); i++) {
					if (tokens[0].charAt(i) == '"') {

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
				}

			} else if (tokens.length == 5) {
				p1 = tokens[0] + "," + tokens[1];
				p2 = tokens[2] + "," + tokens[3];
				peso = Integer.parseInt(tokens[4]);
			} else {
				System.out.println("Error");
				System.exit(0);
			}
			DecoratedElementCoeficient<String> P1 = new DecoratedElementCoeficient(p1);
			DecoratedElementCoeficient<String> P2 = new DecoratedElementCoeficient(p2);
		
			Grafo.insertEdge(P1, P2, (int) peso);

		}

		sc.close();

		System.out.print("Introduce que operación deseas realizar:\n");
		System.out.println(" 1. Recorrer el grafo con el camino BFS");
		System.out.println(" 2. Recorrer el grafo con el camino DFS");
		int casos = read.nextInt();
		while (casos > 0) {
			switch (casos) {
			case 1:
				System.out.println("Has seleccionado la opcion 1: Recorrido con BFS");
				System.out.println("Escribe el nombre del primer personaje");
				p1 = br.readLine();

				System.out.println("Escribe el nombre del segundo personaje");
				p2 = br.readLine();
				
				DecoratedElementCoeficient<String> P1 = new DecoratedElementCoeficient(p1);
				DecoratedElementCoeficient<String> P2 = new DecoratedElementCoeficient(p2);
				Vertex<DecoratedElementCoeficient> V1= Grafo.getVertex(P1.getID());
				Vertex<DecoratedElementCoeficient> V2= Grafo.getVertex(P2.getID());
				System.out.println( P2.pathBFS(Grafo,V1 , V2));
				System.out.print("Introduce que operación deseas realizar:");
				casos = read.nextInt();
				break;
			case 2:
				System.out.println(" Has seleccionado la opcion 2: Recorrido con DFS");
				System.out.println("Escribe el nombre del primer personaje");
				p1 = read.next();
				System.out.println("Escribe el nombre del segundo personaje");
				p2 = read.next();
				System.out.print("Introduce que operación deseas realizar:");

				casos = read.nextInt();
				break;
			default:
				// falta resolver excepcion para que el programa continue y nos vuelva a pedir
				// introducir numero de operación
				System.out.println("Error, por favor seleccione una de las opciones válidas.");
				System.out.print("Introduce que operación deseas realizar:");
				System.out.println(" 1. Recorrer el grafo con el camino BFS");
				System.out.println(" 2. Recorrer el grafo con el camino DFS");
				casos = read.nextInt();
			}
		}
		

	}

}