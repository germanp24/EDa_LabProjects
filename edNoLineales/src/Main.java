import java.io.File;
import java.io.FileNotFoundException;
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

	public static void main(String[] args) throws FileNotFoundException {
		String p1 = null, p2 = null;
		int peso = 0;
		int key=0;
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
			DecoratedElementCoeficient<String> P1 = new DecoratedElementCoeficient(String.valueOf(key), p1);
			DecoratedElementCoeficient<String> P2 = new DecoratedElementCoeficient(String.valueOf(key++), p2);
			key++;
			TreeMapGraph Grafo = new TreeMapGraph();
			Grafo.insertEdge(P1, P2, (int) peso);
		}

		sc.close();

	}

}