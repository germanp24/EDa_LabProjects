package List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * The "Main" class is the class from which we are going to carry out the main functionality
 * of the program, using the previously created classes and according to the provided statement.
 * @authors: Andrea Ordono, Victor Centellas, David Garcia, German Pajarero
 * 
 * @date: November 7, 2022
 * @version: 1.0
 */

public class main {
	 static Scanner TECLADO = new Scanner(System.in);
	 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static ListDynamic<Diccionario> diccionario = new ListDynamic<Diccionario>();
	private static Diccionario dic, dicc;
	
	/**
	 * Method containing the main execution of our program.
	 * @param args String[]
	 */
	public static void main(String[] args) {
		 String Termino = null;
		String Definicion=null;
		
		int casos=menu();
		{
			while (true) {
				switch (casos) {
				case 1:
					dic = new Diccionario(null, null);
					System.out.println("Escriba el termino");
			
					try {
						Termino = br.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
					dic.setTermino(Termino);
					System.out.println("Escriba la definicion del termino");
					
					try {
						Definicion = Termino = br.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
						dic.setDefinicion(Definicion);
					
					diccionario.add(dic);
					
					casos=menu();

					break;
				case 2:
					System.out.println("Eliminar termino del diccionarios");
					Termino = TECLADO.next();
					dicc = new Diccionario(Termino, null);

					diccionario.remove(diccionario.locate(dicc));

					casos=menu();

					break;
				case 3:
					System.out.println("Consultar definicion");
					try {
						Termino = br.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					dicc = new Diccionario(Termino, null);
					System.out.println("La definicion del termino " + Termino + " es : \n"
							+ diccionario.get(diccionario.locate(dicc)).getDefinicion()+"\n");

					casos = menu();
					break;
				case 4:
					System.out.println("Consultar numero de terminos definidos");
					System.out.println("El numero de terminos definidos es: " + diccionario.size());
					casos=menu();
					break;
				case 5:
					System.out.println("Saliendo del programa");
					System.exit(0);
				default:
					System.out.println("Recuerde introduzca entre 1 y 5");
						casos=menu();
						break;
					
				
				}
				
			}
		}
			
		
	}
	public static int menu() {
		System.out.print("Introduce que operacion deseas realizar:\n");
		System.out.println(" 1. Aniadir termino al diccionario");
		System.out.println(" 2. Eliminar termino del diccionarios");
		System.out.println(" 3. Consultar definicion");
		System.out.println(" 4. Consultar numero de terminos definidos");
		System.out.println(" 5. Salir del programa");
		int casos = TECLADO.nextInt();
		
		return casos;
	}
}